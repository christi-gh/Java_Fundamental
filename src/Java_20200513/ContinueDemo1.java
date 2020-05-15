package Java_20200513;

public class ContinueDemo1 {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=10; i++) {
			if (i==6) continue;
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d입니다.(단, 6은 제외한다.)%n", sum);
		
		if(true) return; // 이 이후 문장 수행 X
		outter: for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				if(j==5) continue outter;
				System.out.printf("%d*%d=%d%n", i,j,i*j);
				//label 없으면 j==5만 미출력, label 있으면 j==5 부터 전부 미출력  후 i 증감으로 back
			}
		}
	}
}
