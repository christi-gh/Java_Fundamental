package Java_20200521;

public class ImplementsClassDemo {
	public static void main(String[] args) {
		InterA i = new ImplementsClass();

		i.mA();
		i.mB();
		i.mC();

		//인터페이스에 있는 변수는 변경 불가 - 이유 : final 변수
		//InterA.PI = 3.15;
		
		System.out.println(InterA.PI);
	}
}
