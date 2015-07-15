package encapsulation;


import java.util.Scanner;

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 [오더]
		 카트 두장을 비교해서 카드 번호가
		 더 큰 수가 이기는 게임프로그램을 작성하시오.
		 일단, 프로토타입(시제품) 프로그램으로
		 개발자가 임의의 숫자를 입력하면
		 [출력]
		 [홍길동 : 7] vs [김유신 : 3]
		 홍길동 승리!!
		 * */
		// 선언부 ==> 집에 있는 유저가 자기 모니터 입력
		String name="", name2=""; // 지변 초기화
		int num=0, num2=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름1 :");
		name = scanner.next();
		System.out.println("이름2 :");
		name2 = scanner.next();
		
		// 인터넷 망을 타고 데이터값이 게임회사 들어옴
		CardBean cardBean = new CardBean();
		CardBean hong = new CardBean(name);
		CardBean kim = new CardBean(name2);
		
		// 사용자가 결과화면을 보는 중...
		CardGame game = new CardGame(hong,kim);
		System.out.println(game.getWinner());
	}
}
