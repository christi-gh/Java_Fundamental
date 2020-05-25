package Java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {

		// File Class
		// 1. 디렉토리 생성 (많이 사용)
		// 2. 파일 크기(가장 많이 씀), 이름, 경로, 날짜
		// 3. 파일 생성, 삭제 (삭제 많이 사용)
		// 4. 파일 이름 바꾸기 (많이 사용)

		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if (success) { // if 코딩 안해도 괜찮지만 눈으로 보고싶으면 코딩
			System.out.println("디렉터리를 생성했습니다."); // 있으면 안만들고 없으면 만든다.
		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}

		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length() / 1024; // byte 기준이므로 KB로 출력하고 싶으면 1024로 나누기
		System.out.println(fileSize + "KB");

		String fileName = f2.getName(); // 경로 중 파일 이름만
		System.out.println(fileName);

		String path = f2.getPath(); // 전체 경로 호출
		System.out.println(path);

		if (fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		} else if (fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		// 1970년 1월 1일부터 마지막 수정한 날짜까지의 시간을 밀리세컨즈로 반환
		long lastModified = f2.lastModified();

		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

		String date = sdf.format(c.getTime());
		System.out.println(date);

		File f3 = new File("C:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// f3.delete();

		File f4 = new File("C:\\dev\\Helloworld.java");
		f3.renameTo(f4);
	}
}
