package Java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// ctrl + shift + o : 자동 import 단축키
		// HashSet 객체의 중복을 허용하지 않고, 순서 없음

		// 1.선언 및 생성
		HashSet set = new HashSet();
		// * HashSet<Integer> set = new HashSet<Integer>();
		// * 제너릭 : 데이터 안정성을 위해 '*코드' 사용할 수 있게

		// 2.할당
		set.add(1); // collection에서 primitive 안되나 > auto boxing
		set.add(2);
		// * set.add("1");
		set.add(3);
		set.add(4);
		set.add(1);

		System.out.println(set.size());

		// 3.출력
		Iterator i = set.iterator();
		// * Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			Integer number = (Integer) i.next(); // * 캐스팅 불필요, 코드 깔끔해짐
			System.out.println(number);
		}

		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("성영한1"));
		set1.add(new Customer("성영한2"));
		set1.add(new Customer("성영한3"));
		set1.add(new Customer("성영한1"));

		System.out.println("size : " + set1.size());

		// Lotto - HashSet / 오름차순은 TreeSet
		// TreeSet : 객체의 중복을 허용하지 않음, 오름차순 출력
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			lotto.add(random);
			if (lotto.size() == 6)
				break;
		}

		Iterator<Integer> iter = lotto.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}

	}
}
