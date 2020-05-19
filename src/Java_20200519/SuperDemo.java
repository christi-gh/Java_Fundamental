package Java_20200519;
import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}
}

class A extends Object{ //compiler에 접근한정자는 class의 접근한정자를 따라간다.
	A(int a) {
		
	}
	A() { //default 생성자가 있어야 class B에서 에러가 안남
			//부모클래스는 무조건 default 생성자를 생성한다.
	}
}

class B extends A{
	B() {
		super();
	}
}
