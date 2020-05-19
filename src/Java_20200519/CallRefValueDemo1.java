package Java_20200519;

public class CallRefValueDemo1 {
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 4000;
	}

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 1, 2, 3, 4 };

		System.out.println(i + "," + j[3]);

		change(i, j);

		System.out.println(i + "," + j[3]);

		int a = 10;
		double b = 10.0;
		System.out.println(a == b);

		int[] a1 = { 1, 2, 3, 4 };
		int[] b1 = { 1, 2, 3, 4 };
		int[] c1 = b1;
		System.out.println(a1 == b1);
		System.out.println(c1 == b1);

	}
}
