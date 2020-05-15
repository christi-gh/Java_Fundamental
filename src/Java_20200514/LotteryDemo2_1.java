package Java_20200514;

public class LotteryDemo2_1 {
	public static void main(String[] args) {
		//아영씨꺼
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				while (random == lotto[j]) {
					random = (int)(Math.random()*45) +1;
				}
			}
			lotto[i] = random;
		}
		//오름차순 정렬 코드
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length-(i+1); j++) {
				if(lotto[j] > lotto[j+1]) {
					
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int value : lotto) {
			System.out.print(value + "\t");
		}
	}
}
