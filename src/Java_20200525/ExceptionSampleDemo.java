package Java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {

		// RuntimeException 클래스의 서브클래스 예외들
		// 컴파일에 문제가 되지 않는다. 
		// 예외처리를 해도 되고 안해도 되는 예외들, but 코드가 지저분해짐
		// 개발자들이 넣으면 예외케이스가 발생하지 않지만 사용자의 입력을 받는 경우,
		// ex) parseInt에 문자열을 넣는 경우 NumberFormatException 예외 발생
		// 사용자 입력 등 실행시간 때문에 에러가 나는 경우가 많음, 이를 관리해야함
		// RuntimeException 외에는 컴파일 때 에러가 발생하기에 반드시 예외처리 필요

		// 1.
		// String msg = null;
		// NullPointerException 예외 발생
		// int msgLength = msg.length();
		// System.out.println(msgLength);

		// 2.
		// int[] array = {1,2,3};
		// ArrayIndexOutOfBoundsException 예외 발생
		// int temp = array[3];

		// 3.
		// ArithmeticException 예외 발생
		// int result = 3/0;
		// System.out.println(result);

		// 4.
		// NumberFormatException 예외 발생
		int first = Integer.parseInt("a");
		System.out.println(first);
	}
}
