
package Java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	//year에 대한 setter 매서드
	//setter 메서드를 이용하여 year를 변경합ㄴ다. 
	public void setYear(int year) {
		this.year = year; //변수가 중복될 때 구분하기 위해 this. 추가
	}
	
	//year에 대한 getter 메서드
	//getter 메서드를 이용하여 year를 가져온다.
	public int getYear() {
		return year;
	}
	//this. : 자기 자신 객체
	//로컬 변수와 멤버 변수를 구분할 때 사용한다.cf: this.year(멤버 변수instance) = year(매개 변수);
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {
		int totalCount = 0;

		int preYear = year - 1;

		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;

		return totalCount;
	}

	public void print() {

		int totalCount = getCount();

		int rest = totalCount % 7;
		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");
	}

	
}
