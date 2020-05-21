package Java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		//소수점 둘째자리에서 반올림
		d1 = 45.67;
		
		d1 = d1 * 10;
		l1 = Math.round(d1);
		d1 = (double)l1 / 10;
		
		System.out.println(d1);
		//result = 45.7
		
		int a1 = (int)Math.round(43.5);
		
		a1 = Math.abs(-123);
		System.out.println(a1);
		
		d1 = Math.sqrt(3);
		System.out.println(d1);
		
		a1 = (int)Math.pow(2, 3); //a1 int로 캐스팅
		System.out.println(a1);
		
		d1 = Math.random()*45;
		System.out.println(d1);
	}
}
