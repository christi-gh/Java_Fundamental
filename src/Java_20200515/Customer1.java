package Java_20200515;

//Customer 클래스
public class Customer1 {
	//클래스의 멤버 변수 - instance 변수, static 변수, final 변수
	// ->final 변수(상수, 한 번 정해지면 영원히 안바뀌는 변수), 'static final' 로 쓰임
	// 인스턴스 변수(name, email, phone, balance, isReleased)
	// -> 객체가 생성될 때만 만들어지는 변수
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate; //static으로 잡으면 이자율이 같다, instance 변수인 경우, 사람마다 다름
	public static final String BANKNAME = "신한은행"; //상수는 대문자로 쓴다.
}
