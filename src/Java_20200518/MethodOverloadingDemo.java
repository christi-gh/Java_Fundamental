package Java_20200518;

public class MethodOverloadingDemo {
	//MethodOverloadingDemo 클래스에서는 print 메서드를 4가지 오버로딩
	//오버로딩 작성 규칙
	//1. 같은 클래스 내에서 
	//2. 메서드 이름은 같아야 한다.
	//3. 매개변수 갯수가 같으면 자료형이 달라야 한다.
	//4. 매개변수 갯수가 달라야 한다.
	//5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
	
	//매서드 이름은 V (cf: print), 매개변수는 O (cf:(String str))
	//매개변수명을 포함한 매서드 이름을 짓는건 X (cf:printString)
	public void print(String str) {
		System.out.print(str);
	}

	public void print(int i) {
		System.out.print(i);
	}

	public void print(double d) {
		System.out.print(d);
	}

	public void print(boolean b) {
		System.out.print(b);
	}
	
	public void test(int...a) { //Variable Arguments
		for(int temp : a) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("hello");
		m.print(100);
		m.print(10.34);
		m.print(true);
		m.test(1);
		m.test(1,2);
		m.test(1,2,3);
	}
}
