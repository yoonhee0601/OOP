package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		String name = "", msg = "";
		double height=0.0d, weight=0.0d;
		int idx=0; // 카우푸 인덱스
		Scanner scanner = new Scanner(System.in);
		// 연산부
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("키를 입력하세요");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		weight = scanner.nextDouble();
		
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name);
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		kaupBean.getIndex();
		
		// 출력부
		System.out.println(kaupBean.toString());
	}
}
