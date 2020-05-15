package Java_20200514;

public class LotteryDemo1 {
	public static void main(String[] args) {
		//로또 복권
		//1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		//2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.
		//Math.random() : 0보다 크거나 같고 1보다 작은 양수를 double 값으로 반환한다. 
		//0.000000 ~ 0.999999 double 값을 리턴
				
		//1-45의 임의 랜덤값을 반환
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45)+1;
			//중복되는 값이 있는지 체크하는 변수
			boolean isExisted = false;
			
			//중복을 체크하는 코드
			for (int j = 0; j < i; j++) {
				if(lotto[j]==random) {
					isExisted = true;
					break;
				}
			}
			//상위에서 중복이 안되면 출력 아니면 돌려보내는 코드
			if(!isExisted) {
				lotto[i]=random;
			}else {
				i--;
			}
		}
		//오름차순 정렬 코드 : Bubble sort(Ascending)
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length-(i+1); j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int value : lotto) {
			System.out.print(value +"\t");
		}
	}
}
