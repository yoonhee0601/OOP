package encapsulation;

import abstraction.Account;

/*
객체지향프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다.
그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 한다.
통장을 이루는 요소를 생각해 봅시다.
그 요소가 결국 인스턴수 변수를 구성하게 됩니다.
1. 은행이름 ==> 아이티뱅크 BANK
2. 통장번호 ==> 5자리의 랜덤 숫자 bankBook
3. 소유자 이름 ==> 생성자에 스캐너로 입력받는 값 name
4. 날짜 / 예금 / 출금 / 잔액 => 돈 => 스캐너로 입력받은 값 숫자타입 int => money
5. 비밀번호 => 스캐너로 입력받은 값, 숫자타입 => pass
인터페이스
1. withdraw(int money):void
2. deposit(int money):void
[출력]
=============
[아이티뱅크]
계좌번호 : 12345
이름 : 홍길동
잔액 : 1000원
=============
BankBook 이라는 클래스 라이브러리를
NDriver 에서 다운받아서 사용하세요.
비번은 돈 먼저 입력하세요.
 * */
public class BankBook implements Account{
	// 상수 : final 을 붙여서 절대 불변의 값을 만든다
	// 스테틱 : final 을 빼버리면 절대 불면의 값이 아니라 
	// 		바꿀 수 있지만, 고정된 값 스테틱 값이 된다.
	// 스테틱 = 클래스 변수
	// BankBook b = new Bankbook();
	// b.book --> 인변의 값을 호출한 것
	// BankBook.bank --> 클래스변수 호출하는 모양
	// 위치 : 필드 ==> (인변, 상수, 클래스변수) < 멤변
/*===== 필드 =====*/
	private static String BANK;
	private int bankBook, money, pass;
	private String name, msg; 
	// msg 유효성처리 결과를 알려줘서 고객이 만약
	// 실수로 그렇게 하면 안된다고 알려주는 메세지
/*===== 생성자 =====*/
	public BankBook(String name) {
		this.BANK="아이티뱅크";
		this.bankBook = (int) ((Math.random()*99999)+10000);
		this.name = name;
	}
	// 개발자는 setter 를 쓸지, 생성자로 끝낼지를 고민
	// getter setter 단축키 : ALT + SHIFT + S
	
/*===== 멤버메소드 =====*/
	@Override
	public String toString() {
		
		return "=============\n"
				+ "["+BANK+"]\n"
				+ "계좌번호 : "+bankBook+"\n"
				+ "이름 : "+name+"\n"
				+ "잔액 : "+money+"원\n"
				+ "=============";
	}

	public int getBankBook() {
		return bankBook;
	}

	public int getMoney() {
		
		return money;
	}

	public String getName() {
		return name;
	}
	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	
	@Override
	public void withdraw(int money) {
		
		// 파라미터 값이 정상값이 아닌 상태를 
		// 추적해서 필터링하는 로직이 필요해짐
		// ==> 유효성체크
		if (money <=0) {
			msg = "출금액은 0보다 커야합니다.";
		} else {
			if(this.money < money) {
				msg = "출금액이 잔액보다 큽니다.";
			}else{
				this.money -= money; // 누적된 값에서 마이너스
			}
		}
	}
	@Override
	public void deposit(int money) {
	if (money <=0) {
		msg = "입금액은 0보다 커야합니다.";
	} else {
		this.money += money;
	}
		
	}

	
}
