package Java_20200519;
/**
Calendar 클래스는 엄청난 클래스
 */
public class Calendar {
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	public Calendar() {

	}

	private int getCount(int year, int month, int day) {
		int totalCount = 0;

		int preYear = year - 1;

		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		boolean isLeafYear = isLeafYear(year);

		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;

		return totalCount;
	}

	private int getLastDay(int year, int month) {

		boolean isLeafYear = isLeafYear(year);

		if (isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}

	private boolean isLeafYear(int year) {
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeafYear;
	}
/**
 연도를 출력해주는 메서드입니다.
 */
	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
	}
/**
 월을 출력해주는 메서드입니다.
  */
	public void print(int year, int month) {
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
/**
 요일을 추적해주는 메서드입니다.
 */
	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);
		int dayOfweek = totalCount % 7;
		String message = null;
		if (dayOfweek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfweek == Calendar.TUESDAY) {
			message = "화요일";
		} else if (dayOfweek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfweek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfweek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfweek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfweek == Calendar.SUNDAY) {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");
	}

}