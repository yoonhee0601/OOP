package encapsulation;
/*
 버전업
 현재는 홍길동 승 이라고나오는데
 개선
 ========
 홍길동:6
 김유신:0
 홍길동 승!!
 * */
public class CardGame {
	// 생성자 단축키
	// CTRL + SPACE
	private String winner, looser, msg; // 멤변선언
	private int winnerScore, looserScore;
/*====== Constructor======*/
	// 생성자 압축키
	// CTRL + SPACE
	public CardGame() {} // 디폴트 생성자

	public CardGame(CardBean5 bean1, CardBean5 bean2) {
		// getter 에서 문제해결 패턴
				// 제일 먼저 리턴타입을 카피
			String winner="", looser="";
			int winScore=0, looseScore=0;
				// 지역변수(로컬변수) 는 메모리 영역중에서 (콜)스텍에 저장
				// 인스턴스변수는 메모리영역 중 에서 힙에 저장
				if (bean1.getNum() > bean2.getNum()) {
					winner = bean1.getName();
					looser = bean2.getName();
					winnerScore = bean1.getNum();
					looserScore = bean2.getNum();
					msg = bean1.getName() + " 승리!!";
					
				}else if (bean2.getNum() < bean1.getNum()) {
					winner = bean2.getName();
					looser = bean1.getName();
					winnerScore = bean2.getNum();
					looserScore = bean1.getNum();
					msg = bean2.getName() + " 승리!!";
				} else {
					winner = bean2.getName();
					looser = bean1.getName();
					winnerScore = bean2.getNum();
					looserScore = bean1.getNum();
					msg = "비김";
				}
				this.winner = winner;
				this.looser = looser;
				this.winnerScore = winnerScore;
				this.looserScore = looserScore;
	}
	public String getWinner() {
		return this.winner;
	}
/*====== 멤버메소드 ======*/
	@Override
	public String toString() {
		
		return "=========\n"
				+ "[결과]\n"
				+this.winner+" : "
				+this.winnerScore+"\n"
				+this.looser+" : "
				+this.looserScore+"\n"
				+this.msg
				+"\n=========";
	}
}
