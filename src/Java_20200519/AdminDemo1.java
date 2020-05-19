package Java_20200519;

public class AdminDemo1 {
	public static void main(String[] args) {
		Admin a = new Admin("a123","1111", "avs@avs.avs",1);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1 = new Admin("a123","1111", "avs@avs.avs");
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
	}
}
