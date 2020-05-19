package Java_20200519;
import java.lang.*;

public class SuperDemo1 {
	public SuperDemo1() {
		super();
	}
}

class A1 extends Object { //compiler에 접근한정자는 class의 접근한정자를 따라간다.
	A1(int a1) {
		
	}
	A1() {
		
	}
}

class B1 extends A1 {
	B1() {
		super();
	}
}
