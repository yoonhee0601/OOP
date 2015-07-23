package bank;
/*
@Date : 2015.07.23
@Author : me
@Story : 통장 개설
*/
public class BankBook  {

	/*===== 필드 =====*/
	public static String BANK;
	private int bankBookNo, money, pass;
	private String name, msg; 
	// msg 유효성처리 결과를 알려줘서 고객이 만약
	// 실수로 그렇게 하면 안된다고 알려주는 메세지
/*===== 생성자 =====*/
	public BankBook(String name) {
		this.BANK="아이티뱅크";
		this.bankBookNo = (int) ((Math.random()*99999)+10000);
		this.name = name;
	}
	// 개발자는 setter 를 쓸지, 생성자로 끝낼지를 고민
	// getter setter 단축키 : ALT + SHIFT + S
	
/*===== 멤버메소드 =====*/
	
	public String showAccount() {
		
		return "=============\n"
				+ "["+BANK+"]\n"
				+ "계좌번호 : "+bankBookNo+"\n"
				+ "이름 : "+name+"\n"
				+ "잔액 : "+money+"원\n"
				+ "=============";
	}

	
	
	public int getBankBookNo() {
		return bankBookNo;
	}

	public int getMoney() {
		return money;
	}

	public int getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public String getMsg() {
		return msg;
	}

	public void setBankBookNo(int bankBook) {
		this.bankBookNo = bankBook;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	
	
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

	public void deposit(int money) {
	if (money <=0) {
		msg = "입금액은 0보다 커야합니다.";
	} else {
		this.money += money;
	}
		
	}

}
