package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 에러 발생
		//형변환을 하면 에러가 발생하지 않고, circuit 발생(127에서 다시 -128부터 시작됨)
		//byte a = 128; => 에러 발생
		byte a = (byte)128;
		System.out.println(a);
		
		//float, double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림.
		//실수형을 정수형으로 형변환할 때만 사용
		//왼쪽이 크면 자동으로 왼쪽 것으로 형변환 cf:double d = 4.2f;
		//cut 발생
		int b = (int)42.5;
		System.out.println(b);
		
		// cut 먼저 발생 후. circuit 발생
		byte c = (byte)128.5;
		System.out.println(c);
		
	}
}
