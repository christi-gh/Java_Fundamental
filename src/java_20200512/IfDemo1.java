package java_20200512;

public class IfDemo1 {
	public static void main(String[] args) {
		//Run Configuration => Arguments => Program arguments
		int month = Integer.parseInt(args[0]);
		
		String season = null;
		if(month == 12 || month == 1 || month == 2) {
			season = "Winter";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "Spring";
		}else if(month == 6 || month == 7 || month == 8) {
			season = "Summer";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "Fall";
		}else {
			season = "None";
		}
		System.out.println(month+"월은 "+season+"입니다.");
	}

}
