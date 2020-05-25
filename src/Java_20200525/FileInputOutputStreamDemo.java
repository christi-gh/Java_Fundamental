package Java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("C:\\dev\\jdk.exe");

			// 이 코드를 꼭 외워야한다. '1바이트 읽고 1바이트 출력하시오'
			int readByte = 0;
			// fis.read() : 한 바이트 읽어 반환한다. 더 이상 읽을게 없으면 -1을 반환한다.
			while ((readByte = fis.read()) != -1) { // read 클래스도 반드시 예외처리를 해야하는 메소드
				// fos.write(~) : 한 바이트씩 쓰기
				fos.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) // null 체크 반드시 필요ㅓㅡ
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
