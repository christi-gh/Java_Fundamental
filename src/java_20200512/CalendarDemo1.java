package java_20200512;

public class CalendarDemo1 {
	public static void main(String[] args) {
		
		int year = 2020;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		
		int preYear = year -1;
		
		//2019년 총일 수
		totalCount = preYear * 265 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019년 1월 + 2월 + 3월 + 4월 총일 수
		totalCount += 31+29+31+30;
		
		//2019년 5월 12일의 12일까지 총일 수
		totalCount += day;
		
		rest = totalCount %7;
		String message = null;
		if(rest == 1) {
			message = "Mon";
		}else if(rest == 2) {
			message = "Tue";
		}else if(rest == 3) {
			message = "Wed";
		}else if(rest == 4) {
			message = "Thu";
		}else if(rest == 5) {
			message = "Fri";
		}else if(rest == 6) {
			message = "Sat";
		}else {
			message = "Sun";
		}
		
		System.out.println(year+"년 "+month+"월"+day+"일은"+message+"입니다.");
	}
}
