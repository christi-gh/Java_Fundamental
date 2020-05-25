package Java_20200525;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {
		try {

			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
		} catch (ArrayIndexOutOfBoundsException e) { // 잘못되었을때만 메세지 호출
			// System.out.println("예외 메세지 : "+e.getMessage());
			// System.err.println("2개 넣어!"); // 사용자한테 에러메세지 전달할 시
			e.printStackTrace(); // 에러발생값을 추적, 모든 경로, 정보가 다 나옴 / 개발 시에 활용

			/*
			 * 일반 출력 : System.out 
			 * 에러 출력 : System.err //빨갛게 나온다 콘솔에!! wow
			 */
		} catch (NumberFormatException e) {
			// System.err.println("예외 메세지 : "+e.getMessage());
			System.err.println("문자 말고 숫자 넣어!");
			// e.printStackTrace();
		} finally {
			System.out.println("finally"); // 에러가 나든 안나든 수행
		}
		
		// catch 블럭이 여러개가 있을 경우, 위에서부터 하위 클래스에서 상위 클래스 순으로 정한다.
	}
}
