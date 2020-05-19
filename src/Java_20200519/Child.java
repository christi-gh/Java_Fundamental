package Java_20200519;

public class Child extends Parents {
	String chicken;
	int money;

	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}

	public void play(String starcraft) { // overriding parents play를 child play에서 재정의
		// super.play(starcraft); // parents 것도 놀고
		System.out.println("child play()"); // 내가 노는 것도 놀겠다
	}

	public void setParentsMoney(int money) {
		super.money = money; // this 가 아닌 super를 쓰면 Parents money로 저장
	}

	public int getParentsMoney() {
		return super.money;
	}
}
