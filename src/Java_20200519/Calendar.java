
package Java_20200519;

public class Calendar {
	private int year;
	private int month;
	private int day;

	// 생성자
	public Calendar(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount(int year, int month, int day) {
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

	public void printCalendar(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// 2020년 5월 1일 day를 구해서 일요일부터 1일 이전 날짜까지 공백 처리

		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			rest++;
			if (rest % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public void printCalendarYear(int year) {
		for (int i = 1; i <= 12; i++) {
			printCalendar(year, i);
		}
	}

	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		if (isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}

	public void print() {

		int totalCount = getCount(year, month, day);

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
