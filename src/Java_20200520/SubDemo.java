package Java_20200520;

public class SubDemo {
	public static void main(String[] args) {
		//Super s1 = new Super(); 
		Super s1 = new Sub(); //추상클래스는 자식 클래스를 활용하여 객체 생성 가능
		System.out.println(s1.age);
		s1.playBadook();
		s1.work(); // Sub work() 호출 - 이유 : overriding 메서드는 자식 메서드가 호출됨

		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();

		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();

		// Super s3 = new Sub(); //부모, 자식 클래스가 모두 일반 클래스인 경우 이렇게 코딩 절대 X
		// Super가 추상클래스로 객체를 만들 수 없는 경우 이러한 케이스를 사용할 수 있음
		// 부모의 타입이 자식의 도움을 받아 부모를 메모리에 올림

		Super s3 = s2;
		System.out.println(s3.age);
		s3.playBadook();
		s3.work();

		// s3.height = 20;
		// s3.playGame();
	}
}
