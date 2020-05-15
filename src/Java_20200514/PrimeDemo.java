package Java_20200514;

public class PrimeDemo {
	public static void main(String[] args) {
		int prime = 0;
		for (int i = 2; i < 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					prime++;
				}
			}
			if (prime == 1) {
				System.out.println(i);
			}
			prime = 0;
		}
		
	}
}
