package Java_20200525;
//사용자 정의 예외 클래스
public class IncorrectAccountException extends Exception {
	public IncorrectAccountException(String msg) {
		super(msg); //super는 상단의 Exception 의미
	}
}
