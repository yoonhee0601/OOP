package encapsulation;
/*
 * @Date:2015.07.15
 * @Author:me
 * @Story: 생성자 문법
 	생서자는 setter 를 통해 값을 할당하는
 	기능을 보강하여, 객체가 만들어짐과
 	동시에 값을 할당하도록
 	특수하게 만들어진 ★★★메소드 이다.
 * */
public class CardBean3 {
/*===== Field ======*/
	private String name, name2; // 멤변, 초기화 하지 않음
	private int num, num2;
/*===== Constructor ======*/
	// 생성자 위치는 (멤버)필드 메소드 영역 사이에 위치
	// 생성자 모양
	// public 클래스 이름(){}
public CardBean3(){} // 디폴트 생성자
public CardBean3(String name) {
	// setter 역할을 겸용하는 생성자
		this.name = name;
		this.num = (int) ((Math.random()*13)+1);
	}
	//디폴트 생성자는 개발자가 직접 만들지 않아도
	// 프로그램 내부에서는 생성되어 있는 것으로 인식한다.
	// 그런데, 이것을 꺼내 든 이유는
	// new 키워드를 통한 객체생성 역할뿐 아니라
	// 생성과 동시에 값을 할당하는 기능을 추가 시키기 위해서 ...

	/*===== Method ======*/
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
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
