package Java_20200522;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {
	private ArrayList<Member> list = new ArrayList<Member>();

	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
	}

	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next(); // 키보드에서 입력한 데이터를 반환
	}

	public void run(String inputData) {
		if (inputData.equals("1")) {
			insert();
		} else if (inputData.equals("2")) {
			update();
		} else if (inputData.equals("3")) {
			delete();
		} else if (inputData.equals("4")) {
			search();
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		} else {
			System.out.println("똑바로해!");
			print();
			String inputD = input("번호를 선택하세요>");
			run(inputD);
		}
	}

	// 1. 아이디를 입력받는다. (V)
	// 2. 이름을 입력받는다. (V)
	// 3. ArrayList에 고개를 추가한다. (V)
	// 4. ArrayList에 있는 모든 고객을 출력한다. (V)
	// 5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다. (V)
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.

	public void insert() {
		String id = input("아이디>");
		String name = input("이름>");

		Member m = new Member(id, name);
		list.add(m);

		for (Member mem : list) {
			System.out.printf("아이디 : %s , 이름 : %s %n ", mem.getId(), mem.getName());
		}

		print();
		String search = input("번호를 선택하세요>");
		run(search);

		print();
		String delete = input("번호를 선택하세요>");
		run(delete);

		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
	}

	// 1. 수정할 아이디를 입력받는다.
	// 2. ArrayList에 있는 고객정보에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고,
	// ArrayList의 고객정보를 수정한다. 만약, 수정할 아이디가 없으면 "수정할 아이디가 없습니다."
	// 메세지를 출력한다.
	// 3. ArrayList에 있는 모든 고객을 출력한다.
	// 4. print() 메서드 호출
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update 	{
		String id = input("아이디>");
		String name = input("이름>");
		
		Member m = new Member(id, name);
		m.indexOf();
		
		for(Member id : list) {
			System.out.println("");
		}
			
		print();
		String search = input("번호를 선택하세요>");
		run(search);
		
		print();
		String update = input("업데이트할 이름을 입력하세요");
		
		
		//indexOf
	}

	// 1. 삭제할 아이디를 입력받는다.
	// 2. ArrayList의 Member 객체 중에서 삭제할 아이디를 찾아 있으면 삭제하고, 없으면
	// "삭제할 아이디가 없습니다." 메세지를 출력한다.
	// 3. ArrayList에 있는 모든 고객을 출력한다.
	// 4. print() 메서드 호출
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete 	{
		String id = input("아이디>");

	}

	// 1. 검색할 아이디를 입력받는다.
	// 2. ArrayList에 Member 객체 중에서 검색할 아이디를 찾아서 있으면 출력하고, 없으면
	// "검색된 결과가 없습니다." 메세지 출력
	// 3. ArrayList에 있는 모든 고객을 출력한다.
	// 4. print() 메서드 호출
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search 	{
		String id = input("아이디>");

	}

	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
	}
}
