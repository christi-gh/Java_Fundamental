package Java_20200527;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress i = InetAddress.getLocalHost();
		System.out.printf("호스트 이름은 : %s%n", i.getHostName());
		System.out.printf("호스트 IP : %s%n", i.getHostAddress());
		
		InetAddress i2 = InetAddress.getByName("naver.com");
		System.out.printf("호스트 이름은 : %s%n", i2.getHostName());
		System.out.printf("호스트 IP : %s%n", i2.getHostAddress());
	}
}
