package Java_20200519;

public class GarbageCollectorDemo1 {
	public static void main(String[] args) {
		Admin a1 = new Admin();
		a1 = new Admin();
		a1 = null;
		
		a1 = new Admin(); //reference count => 1
		Admin a2 = a1; //reference count => 2
		a1 = null; //reference count => 1
		a2 = null; //reference count => 0
	}
}
