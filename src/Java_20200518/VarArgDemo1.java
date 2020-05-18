package Java_20200518;

public class VarArgDemo1 {

	public void print(int... a) {// variable arguements
		// a 변수는 배열을 처리함.
		int length = a.length;

		for (int value : a) {
			System.out.printf("%d ", value);
		}
		System.out.println(); // 개행
	}

	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		v1.print(1);
		v1.print(10, 20);
		v1.print(100, 200, 300);
		v1.print(1000, 2000, 3000, 4000);
	}
}
