package inhebitance;
/*
@Date:2015.07.20
@Author:me
@Story: 
* */
import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		CelPhone nokia = new CelPhone();
		/*
		 [콘솔 출력문]
		 노키아 전화기를 사용해서
		 폰을 가지고 다닐수 있음
		 홍길동에게 전화를 검
		 * */
		nokia.setCompany("삼성 가정용 전화기");
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람 : ");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCompany()+" 를 사용해서");
		System.out.println(nokia.getCall());
		nokia.setPortable(true); // 휴대폰은 이동성이 존재하므로
		// boolean 타입의 set 메소드를 이용하여
		// setMove 를 자동 설정하게끔 유도하고
		// 출력은 is Portable() 이 아니라
		 // getMove() 를 호출하게 하는 패턴
		System.out.println(nokia.getCompany());
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCall());
	}
}
