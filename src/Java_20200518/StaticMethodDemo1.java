package Java_20200518;

public class StaticMethodDemo1 {
	String name;
	static double interestRate;

	public void m1() {
		// instance 메서드에서는 instance 변수, static 변수 모두 사용 가능
		// instance 매서드에서는 instance 메서드, static 메서드 모두 호출 가능
		name = "christi"; // instance 변수 앞에 this. 생략 => this.name / this 는 자기 자신 객체
		interestRate = 4.2;
		this.m2();
		StaticMethodDemo.m4(); // 자기 자신 클래스 내에서는 생략 가능하나 서로 다른 클래스에 있을 경우, 해당 변수가 있는 class명을 써야함.
	}

	public void m2() {
		System.out.println("m2() 인스턴스 메서드 호출");
	}

	public static void m3() {
		// static 매서드에서는 static 변수만 사용 가능, instance 변수 사용 불가
		// static 매서드에서는 static 메서드만 호출 가능, instance 메서드 호출 불가
		// name = "james";
		// static 매서드에서는 this를 사용할 수 없음
		StaticMethodDemo.interestRate = 3.9; // static 변수 앞엔 staticMethodDemo. 생략
		// m2();
		StaticMethodDemo.m4();

		// static 매서드에서 instance 변수와 instance 메서드를 호출하려면 객체를 먼저 생성해서 사용

		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "james";
		m1.m2();
	}

	public static void m4() {
		System.out.println("m4 static 매서드 호출");
	}

	public static void main(String[] args) {
		m4();
		m3();
		interestRate = 4.3;

		StaticMethodDemo m = new StaticMethodDemo();
		m.m1();
		m.m2();
		// m.name = "손정의"
	}
}
