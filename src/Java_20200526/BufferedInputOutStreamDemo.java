package Java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			/*
			 * // 1. FileInputStream과 FileOutputStream을 이용해서 1바이트씩 읽어서 1바이트씩 출력하는 예제 // 경과시간
			 * : 250000 
			 * fis = new FileInputStream("C:\\dev\\Git-2.26.2-64-bit.exe"); 
			 * fos =
			 * new FileOutputStream("C:\\dev\\Git.exe");
			 * 
			 * int readByte = 0; long start = System.currentTimeMillis(); 
			 * while ((readByte = fis.read()) != -1) { 
			 * fos.write(readByte); } 
			 * long end = System.currentTimeMillis(); 
			 * System.out.printf("경과시간 : %d %n", end-start);
			 * 
			 */

			/*
			 * // 2. FileInputStream과 FileOutputStream을 이용해서 8192바이트 읽고 8192바이트 출력하는 예제 //
			 * 경과시간 : 64(밀리세컨드) 
			 * fis = new FileInputStream("C:\\dev\\Git-2.26.2-64-bit.exe");
			 * fos = new FileOutputStream("C:\\dev\\Git.exe");
			 * 
			 * int readByteCount = 0; 
			 * byte[] readBytes = new byte[1024 * 8]; 
			 * long start = System.currentTimeMillis(); 
			 * while ((readByteCount = fis.read(readBytes)) !=-1) { 
			 * fos.write(readBytes, 0, readByteCount); } 
			 * long end = System.currentTimeMillis(); 
			 * System.out.printf("경과시간 : %d %n", end - start);
			 * 
			 * 
			 */
			
			// 3. BufferedInputStream과 BufferedOutputStream을 이용하여 1바이트 읽어서 1바이트 출력 예제 
			// 경과시간 : 1068 (밀리세컨드)
			// BufferedInputStream의 read() 메서드는 1바이트 읽어서 
			// BufferedInputStream의 버퍼(byte[]) 공간에 저장한다.
			// BufferedOutputStream의 write() 메서드는 1바이트 출력하는 것이 아니라
			// BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차있으면 출력한다.
			// 만약 다 채워지지 않으면 출력하지 않음
			// 이런 경우 flush() 메서드를 이용해야한다. 
			
			fis = new FileInputStream("C:\\dev\\Git-2.26.2-64-bit.exe");
			// stream channing > 기능이 향상됨
			bis = new BufferedInputStream(fis, 1024*10);
			fos = new FileOutputStream("C:\\dev\\Git2.exe");
			bos = new BufferedOutputStream(fos);

			int readByte = 0;
			long start = System.currentTimeMillis();
			while ((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			// BufferedOutStream의 버퍼(byte[])가 다 채워지면 자동으로 전송되지만
			// 다 채워지지 않으면 전송되지 않는다. 따라서 다 채워지지 않더라도 버퍼를 비우기 위해서 flush() 사용.
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", end - start);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
				if (bis != null) bis.close();
				if (bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
