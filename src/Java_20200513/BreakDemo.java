package Java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i <= 10; i++) {
			if(i==6) break;
			sum += i;
		}
		System.out.printf("1부터 5까지 합은 %d입니다.%n", sum);
		
		outter:for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				if(i==5 && j ==6) break outter; //break 만으로는 빠져나갈 수 없으므로 lable 추가
				System.out.printf("%d*%d=%d%n", i,j,i*j);
			}
		}
		int i=2;
		boolean isPrime =true;
		for (int n = 2; n < i; n++) {
			if (i % n == 0) {
				isPrime = false;
		        break;
			}
			continue;
		}
	}

}
