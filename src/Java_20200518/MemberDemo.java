package Java_20200518;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member ();
		//m.name = "ddd"
		//System.out.println(m.name); //이런 코딩 이제 안합니다.
		m.setName("abc");
		m.setZipcode("12345");
		m.setAddr1("Seoul");
		m.setAddr2("Jongro-gu");
		m.setSsn1("111111");
		m.setSsn2("1111118");
		m.setAge(30);
		m.setRegdate("2020-05-18");		
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
	}
}
