package Java_20200522;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		// StringBuffer 클래스는 Object의 equals()메서드를 overriding하지 않았기 때문에
		// Object의 equals()메서드를 사용
		System.out.println(s1.equals(s2));
		
		// StringBuffer => String : toString()
		String s3 = s1.toString();
		String s4 = s2.toString();
		
		System.out.println(s3.contentEquals(s4));
		
		//
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '성영한' ");
		sql.append("order by name desc");
		
		System.out.println(sql); //sql.toString overriding 되어있음
		
		// StringBuffer에 모든 문자열을 삭제
		sql.setLength(0); 
		
		//
		sql.append("select no, writer from board");
		
		System.out.println(sql);

	}
}
