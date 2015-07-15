package encapsulation;

import java.util.Scanner;

/*
 * @Date:2015.07.14
 * @Author:me
 * @Story: 월급계산 main()
 * */
public class PayMain {
	public static void main(String[] args) {
		/*
		 [오더]
		 Pay 프로그램은 월급을 입력받아서
		 세금을 떼고 실급여를 고객에게
		 알려주는 프로그램입니다.
		 세율은 10% 
		 출력문은
		 [홍길동 실급여]
		 월급 : 100만원
		 세금 : 10만원
		 실급여 : 90만원
		 * */
		// 선언부
		String name = "";
		int salary=0, tax=0, money=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		name = scanner.next();
		System.out.println("월급 : ");
		salary = scanner.nextInt();
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setSalary(salary);
		
		System.out.println(payBean.getName() + "님 반갑습니다.");
		
		System.out.println(payBean.toString());
		
		
	}
}
