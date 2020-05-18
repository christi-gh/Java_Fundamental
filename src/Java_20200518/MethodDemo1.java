package Java_20200518;

public class MethodDemo1 {
	// 8-12line method를 정의
	// boolean은 method의 반환값
	// instance method
	// int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
		// method 반환값이 boolean이기 때문에 return value의 value값도 boolean 이어야한다.
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;
	} // 속성은 return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 해도 됨

	public long plus(int first, int second) {
		return (long) first + (long) second;
		// (long)(first+second) 한꺼번에 long으로 하면 안돼, 괄호 우선연산 때문
	}

	public double divide(int first, int second) {
		return (double) first / second; // (double)로 앞에 하나만 바꿔도 뒤는 자동으로 바뀜
	}

	public void println(String message) { // 문자열만 들어옴
		System.out.println(message);
	}

	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
