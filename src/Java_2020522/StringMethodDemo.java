package Java_2020522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-1111118";
		// charAt(int index) : 문자열 중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat(String str) : 문자열 연결
		ssn = ssn.concat("abc");
		System.out.println(ssn);

		// endsWith(String suffix) : 문자열 마지막이 괄호 안의 것으로 끝나면 true, 아니면 false
		String fileName = "abcd.doc";
		if (fileName.endsWith("doc")) {
			System.out.println("워드문서입니다.");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		} else {
			System.out.println("파일입니다.");
		}

		// startsWith(String prefix) : 문자열이 괄호 안의 것으로 시작하면 true, 아니면 false
		String url = "http://www.naver.com";
		String path = "/news/ssss.do?id=123";
		if (path.startsWith("/news")) {
			System.out.println("뉴스 페이지입니다.");
		} else if (path.startsWith("/sports")) {
			System.out.println("스포츠 페이지입니다.");
		} else {
			System.out.println("페이지가 존재하지 않습니다.");
		}

		// equalsIgnoreCase(Object obj) : 대소문자를 구분하지 않고 문자열 비교
		boolean success = fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);

		// indexOf (String msg) : msg 특정 문자열이 몇 번째인지 위치를 반환
		int index = ssn.indexOf("-");
		System.out.println(index);

		// lastIndexOf(String msg) : msg 문자열 맨 뒤부터 계산하여 처음부터 센 위치로 반환
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));

		// 배열의 길이 : length, 문자열의 길이 : length()
		// trim() 앞뒤 문자열 공백 제거
		String dbId = "syh1011".trim();
		String userId = "syh1011 ".trim();
		System.out.println(dbId);
		System.out.println(userId);
		System.out.println(dbId.length());
		System.out.println(userId.length());
		System.out.println(dbId.equals(userId));
		System.out.println(dbId.equalsIgnoreCase(userId));
		System.out.println(dbId == userId);

		// substring : 인자가 하나면 거기서부터 끝까지, 두 개면 앞부터 뒷인자 바로 앞까지 추출
		fileName = "abc.doc";
		String first = fileName.substring(0, fileName.indexOf(".")); // 0은 포함, 뒤는 미포함 바로 앞자리까지 추출
		System.out.println(first);
		String last = fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(last);

		// replaceAll (String first, STring second)
		// first 문자열을 second문자열로 대체
		String html = "안녕하세요\n저는 성영한입니다.\n잘부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);

		// toUpperCase() : 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);

		// toLowerCase() :소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1.toString());

		// String.valueOf() : primitive data type 을 문자열로 변환
		char[] c1 = { 'a', 'b', 'c' }; // 이 때는 char을 문자열로 바꾸는 기능
		String msg = String.valueOf(c1); // 괄호 안에 true 넣으면 결과값 true로 바뀌어 출력
		System.out.println(msg);

		// String[] split : 괄호 기준으로 왼쪽 오른쪽을 나눔
		String[] str = ssn.split("-");
		String ssn1 = str[0];
		String ssn2 = str[1];
		System.out.println(ssn1);
		System.out.println(ssn2);

		// String.format :
		String str2 = String.format("%,.2f", 123123.4567); // , 콤마 찍어줌 //정수는 %d 실수는 %f
		System.out.println(str2); // 반올림도 해준당

		//
		str2 = String.format("%3$,20.2f %f %f", 1234.45, 123345.56, 34234.5690);
		System.out.println(str2);

	}
}
