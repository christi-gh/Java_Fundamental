package Java_20200527;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlImageDownloadDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300");

		InputStream in = url.openStream(); // information of image
		FileOutputStream fis = new FileOutputStream("C:\\dev\\1.jpg");

		int readByteCount = 0;
		byte[] readBytes = new byte[1024 * 8];

		while ((readByteCount = in.read(readBytes)) != -1) {
			fis.write(readBytes, 0, readByteCount);
		}

		in.close();
		fis.close();

	}
}
