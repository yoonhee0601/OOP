package encapsulation;
/*
 은행계좌
 * */
public class Account {
	private String bank, name;
	private int bankBook, money, password;
/*=====================================================*/
	public Account() {
		this.bank = "아이티뱅크";
		this.bankBook = (int) ((Math.random()*99999)+10000);
		this.password = 12345;
	}
/*=====================================================*/
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	public String getBank() {
		return bank;
	}
	public String getName() {
		return name;
	}
	public int getBankBook() {
		return bankBook;
	}
	public int getMoney() {
		return money;
	}
	public int getPassword() {
		return password;
	}
	
}
