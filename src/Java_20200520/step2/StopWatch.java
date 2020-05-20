package Java_20200520.step2;

public class StopWatch {

	// 밀리세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;

	// 밀리세컨드의 경과시간
	public double getElapsedTime() { // 메서드
		return (double) (endTime - startTime) / 1000;
	}

	// 밀리세컨드의 시작시간
	public void start() {
		startTime = System.currentTimeMillis();
	}

	// 밀리세컨드의 종료시간
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// 나노세컨드를 관리하기 위한 변수
	long startNanoTime;
	long endNanoTime;

	// 나노세컨드의 경과시간
	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / 1_000_000_000;
	}

	// 나노세컨드의 시작시간
	public void startNano() {
		startNanoTime = System.nanoTime();
	}

	// 나노세컨드의 종료시간
	public void stopNano() {
		endNanoTime = System.nanoTime();
	}
}
