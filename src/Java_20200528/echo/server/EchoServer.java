package Java_20200528.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;

		// 1. ServerSocket 객체를 생성한다.
		try {
			serverSocket = new ServerSocket(port);

			while (true) {
				System.out.println("클라이언트 접속을 기다리고 있습니다.");
				// 2. accept() : 클라이언트 접속을 기다리고 있음
				// 클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket 객체를 생성해준다.
				Socket socket = serverSocket.accept();
				// System.out.println("클라이언트와 연결 성공...");
				InetAddress i = socket.getInetAddress();
				String ip = i.getHostAddress();
				System.out.printf("클라이언트가 접속했습니다.[%s]%n", ip);

				// 5. Socket 객체로 입력 스트림을 생성하여 클라이언트 메세지를 읽는다.
				InputStream in = socket.getInputStream();
				// Stream chain
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();

				System.out.println("클라이언트 메세지 : " + readLine);

				// 6. Socket 객체로 출력 스트림을 생성하여 클라이언트에게 메시지를 다시 보낸다.
				OutputStream out = socket.getOutputStream();
				// Stream chain
				OutputStreamWriter osw = new OutputStreamWriter(out);
				// Stream Chain
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoServer(3000).run();
	}
}
