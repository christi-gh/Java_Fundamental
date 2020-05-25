package Java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.setTimeInMillis(1589168453346l);

		//SimpleDateFormat 사용하면 아래 코딩 필요없음
		//int year = cal.get(Calendar.YEAR);
		//int month = cal.get(Calendar.MONTH)+1; //month count from 0, so need to plus 1.
		//int day = cal.get(Calendar.DATE);
		
		//int hour = cal.get(Calendar.HOUR);
		//int minute = cal.get(Calendar.MINUTE);
		//int second = cal.get(Calendar.SECOND);
		//System.out.println(year + "," + month+","+day);
		//System.out.println(hour + "," + minute+","+second);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}
}
