package Java_20200519;

public class ChildDemo1 {
	public static void main(String[] args) {
		Parents1 p = new Parents1();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		
		System.out.println(p.money);
		
		Child1 c = new Child1();
		c.money = 1_000_000_000;
		c.setParentsMoney(1_000_000);
		c.chicken = "rychs";
		c.gotoSchool();
		c.makeMoney();
		c.play("omok");
		
		System.out.println(c.money);
		System.out.println(c.getParentsMoney());
		System.out.println(c.chicken);
	}
}
