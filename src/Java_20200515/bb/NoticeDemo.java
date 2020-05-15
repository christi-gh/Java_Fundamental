package Java_20200515.bb;
import Java_20200515.aa.Notice;//서로 다른 패키지일 경우 import 해야지만 클래스 보임
public class NoticeDemo extends Notice{   //extends Notice 상속하는 코드
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number =2; 
		//protected 는 서로 다른 패키지일 경우 상속 받은 경우에만 접근 가능
		//n1.title = "제목";
		
		//default 는 같은 패키지 내에서만 접근 가능
		//n1.hit = 100;
		
		//private 은 같은 클래스내에서만 접근 가능
		//n1.regdate = "2020-05-15";
		
		//부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public, protected
		NoticeDemo n2 = new NoticeDemo ();
		n2.number = 3;
		n2.title = "제목";
		//n2.hit = 100;
		//n2.regdate = "2020-05-15";		
	}
}
