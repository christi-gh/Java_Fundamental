package Java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;

	// 디폴트 생성자(default constructor) : 매개변수 없음
	// alt + shift + s, c
	// 생성자가 있던 없던 무조건 디폴트 생성자 먼저 만들고 시작합시다 (!!!)
	public Admin() { // public 아니고 private 로 하면 에러남
		super(); // super(); 모든 생성자 처음에는 super가 숨어있음
					// 부모 클래스의 디폴트 생성자를 호출
	} // 이거 안만들어도 에러 안남

	// 생성자(Constructor)
	// alt + shift + s, o
	// 생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	// 생성자의 역할은 인스턴스 변수 초기화
	public Admin(String id, String pwd, String email, int level) {
		// super(); 모든 생성자 처음에는 super가 숨어있음
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public Admin(String id, String pwd, String email) {
		// super(); 모든 생성자 처음에는 super가 숨어있음
		// this.id = id;
		// this.pwd = pwd;
		// this.email = email;
		this(id, pwd, email, 0); // 다른 생성자 호출, 반드시 생성자에서만 호출 가능
		// this 용법 2가지
		// 1. 자기 자신 객체 => this.
		// 2. 다른 생성자 호출 => this(~,~,,,)
	}

	public String getId() {
		return id;
	}

	// id에 대한 setter매서드
	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
