package Java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("C:\\dev\\jdk2.exe");

			int readByteCount = 0; // 읽은 바이트 수
			byte[] readBytes = new byte[1024 * 8]; // 읽은 바이트 배열로 저장

			// fis.read(readBytes) : FileInputStream에 8192바이트를 읽어서 readBytes에 저장하고 
			// 읽은 바이트 수를 반환
			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount); // 읽기 시작한 곳부터 읽은 곳까지 쓰기
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}

	}
}
