package Java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		PrintStream monitor = System.out; // System.out은 출력장치와 연결된 PrintStream
		monitor.println("Hello World");
		System.out.println("Hello"); //err msg 는 catch block 에서 사용
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {
			fis = new FileInputStream("C:\\dev\\Git-2.26.2-64-bit.exe");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\dev\\Git2.exe");
			bos = new BufferedOutputStream(fos);
			//file과 연결된 PrintStream
			
			ps = new PrintStream(bos, true); // true => autoFlush

			int readByte = 0;
			while ((readByte = bis.read()) != -1) {
				//ps.print(readByte); // 둘 다 가능하나, print 는 버퍼 기능이 없어 속도가 느리다.
				ps.write(readByte);
			}
			// flush() 안해도 됨
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) ps.close();
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(fos != null) fos.close();
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
