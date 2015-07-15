package encapsulation;
/*
 * @Date:2015.07.14
 * @Author:me
 * @Story: 월급계산
 * */
public class PayBean {
	// 메소드는 선언부, 연산부, 출력부 이렇게 나누고
	// Bean 클래스라면 멤버필드 + 멤버메소드
	
	private String name; // 멤버필드 변수(멤변)는 초기화를 하지 않는다!!!
	private int salary;
	
	// 멤버 메소드 영역이 시작
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getTax() {
		int tax=0; // 지변은 초기화 필수!!
		tax = (int) (salary * 0.1);
		return tax;
	}
	/*
	 this 는 이 클래스 내부에 있는 ~~~ 의미
	 * */
	public int getMoney() {
		int money = 0; // 지변 초기화
		money = salary - this.getTax();
		return money;
	}
	
	@Override
	public String toString() {
		
		return "["+this.name+" 실급여]\n월급 : "+this.salary+"만원\n"
				+ "세금 : "+this.getTax()+"만원\n실급여 : "+this.getMoney()+"만원";
	}
}
