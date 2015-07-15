package encapsulation;

public class CardBean2 {
	private String name, name2; // 멤변, 초기화 하지 않음
	private int num, num2;
	
	public void setName(String name) {
		// () 안에 값을 파라미터 라하고 소속은 지변
		this.name = name;
		// this.name 은 인스턴스변수(멤변)이고
		// = name 은 파라미터로 넘어온 지변(스캐너가 맏은 값)
		// 멤변 name 에 할당하라.
		// 파라미터값과 멤변값의 이름은 달라도 상관없다.
		// 단, 데이터타입(String, int) 은 반드시 일치해야 한다
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setNum() {
		// 외부에서 받는 숫자가 없으므로 파라미터가 필요없다.
		this.num = (int) ((Math.random()*13)+1);
		// 1부터 13까지의 정수 중에서 랜덤 숫자를 리턴
	}
	public void setNum2() {
		this.num2 = (int) ((Math.random()*13)+1);
	}// scanner 로 받는 것은 set
	public String getWinner() {
		// getter 에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
		String winner="";
		if (this.num > this.num2) {
			winner = name + "승리";
		}else if (this.num < this.num2) {
			winner = name2 + "승리";
		} else {
			winner = "비김";
		}
		return winner;
	}// 연산하는 것은 get, main 으로 보냄
	@Override
	public String toString() {
		return "["+name+" : "+num+"] vs ["+name2+" : "+num2+"]\n"
				+this.getWinner();
	}
}
