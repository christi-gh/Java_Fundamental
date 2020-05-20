package Java_20200520.step1;

//밀리 세컨드로 경과시간을 알려주는 어플리케이션을 만들어주세요.
public class FootStopWatch { // 클래스
	long startTime; // 멤버변수
	long endTime;

	public double getElapsedTime() { // 메서드
		return (double) (endTime - startTime) / 1000;
	}

	public static void main(String[] args) {

		FootStopWatch f1 = new FootStopWatch();
		// 로직
		// 1970년 1월 1일부터 지금까지 시간을 밀리 세컨드로 반환 System.currentTimeMillis();
		f1.startTime = System.currentTimeMillis(); 

		for (long i = 0; i < 20_000_000_000l; i++) {

		}

		f1.endTime = System.currentTimeMillis();

		double elapsedTime = f1.getElapsedTime();

		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
