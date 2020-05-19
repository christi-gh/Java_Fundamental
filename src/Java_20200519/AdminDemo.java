package Java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("a123", "1111", "avd@avd.avd", 1);
		// a.setId("a123"); //메서드를 통해서만 값을 변경 혹은 가져올 수 있음
		// a.setPwd("1111");
		// a.setEmail("avd@avd.avd");
		// a.setLevel(1);

		// String id = a.getId(); //변수를 밑에서 재사용할 경우에는 변수를 받아야 함
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());

		Admin a1 = new Admin("a124", "2222", "avd2@avd.avd");

		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	}
}
