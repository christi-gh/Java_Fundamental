package Java_20200519;

public class Child1 extends Parents{
	String chicken;
	int money;
	
	
	public void gotoSchool() {
		System.out.println("child gotoSchool()");
	}
	
	public void play(String starcraft) {
		System.out.println("child play");
	}

	public int getParentsMoney() {
		return super.money;
	}

	public void setParentsMoney(int money) {
		super.money = money;
	}
	
}
