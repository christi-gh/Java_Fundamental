package Java_20200521;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		//equals() 매서드가 true가 나오는 이유는 object 클래스의 equals()매서드 오버라이딩했기 때문
		System.out.println(s1.equals(s2));
		
		String s3 = "world";
		String s4 = "world";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		
	}
}
