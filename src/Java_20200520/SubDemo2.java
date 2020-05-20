package Java_20200520;

public class SubDemo2 {

	public static void change(Super sup) { //Super sup = s1;
		sup.age = 20;
	}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1);
		
		System.out.println(s1.age);
	}
}
