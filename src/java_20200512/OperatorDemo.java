package java_20200512;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		
		c = a+b;
		System.out.println(c);
		
		c = a-b;
		System.out.println(c);
		
		//d=b/1로 하면 int끼리 나눠서 2.2에서 소수점 이하가 없어짐.
		//그려서 2가 값인데, 이게 자동으로 double로 자동 형변환되어 2.0로 값이 입력됨.
		//하여, (double)로 형변환 필요
		//각자 해주지만, 그 중 하나만 넣어줘도 ok.
		d = (double)b/(double)a;
		System.out.println(d);
		
		c = a*b;
		System.out.println(c);
		
		//나머지 연산자
		c = b%a;
		System.out.println(c);
		
		a += b; // => 이렇게 써도 됨. a = a+b;
		System.out.println(a);
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
				
		a = 10;
		b = 20;
		
		a++; // a = a+1;
		++b; // b = b+1;
		
		System.out.println(a); //11
		System.out.println(b); //21
		
		//대입 후 증가
		c = a++; // c=>11
		System.out.println(c);
		
		//증가 후 대입
		c = ++b; // c=>22
		System.out.println(c);
		
		a = 10;
		b = 20;
		d = 10.0;
		
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		isSuccess = a == d;
		System.out.println(isSuccess); // primitive data type 의 == 연산자는  자료형에 상관없이 값만 같으면  true를 반환한다.
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		a = 10;
		b = 20; 
		
		// a && b => a가 false이면 b를 연산하지 않음 (short circuit)
		
		
		isSuccess = (a == b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		b = 10;
		
		// a || b => a가 true이면 b를 연산하지 않음(short circuit)
		
		isSuccess = (a == b) || (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		// + => 연결연산자 (두 개 중 1개 이상이 문자열일 경우)
		// 산술연산자 (두 개 모두 숫자일 경우)
		
		System.out.println(1+2+3+"456");
		System.out.println("123"+(4+5+6)); //뒤에 괄호(우선순위)가 없으면 연결연사자만 남음. cf) "123"+4+5+6 => 123456 
	}

}
