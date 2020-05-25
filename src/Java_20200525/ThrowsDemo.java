package Java_20200525;

public class ThrowsDemo {
	public static int getDivide(int first, int second) throws ArithmeticException {
		int result = first / second; // 예외가 발생할 수 있는 코드, try-catch로 묶을 수 없음 > throws
										// 여기서 예외처리를 하기 어려운 경우 아래 호출하는 쪽으로 던져버려 
		return result;
	}

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]); // 예외가 발생할 수 있는 코드
			int second = Integer.parseInt(args[1]); // 예외가 발생할 수 있는 코드

			int result = getDivide(first, second);
			System.out.printf("결과 : %d%n", result);

		} catch (ArrayIndexOutOfBoundsException e) { 
			System.err.println("인자를 2개 입력하셔야 합니다.");
		} catch (NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다.");
		} catch (ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("finally");
		}
		System.out.println("끝"); //catch블록을 안하면 JVM이 제어권을 가져가 마음대로 종료시킴, 끝 츨력안됨
	}
}
