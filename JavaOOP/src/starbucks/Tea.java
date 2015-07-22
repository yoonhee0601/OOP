package starbucks;

public class Tea implements Recipe {
	/*
	 홍차(Tea) 끓이는 순서
	 1. 물을 끓인다.
	 2. 티백을 내린다.
	 3. 물을 컵에 붓는다.
	 4. 레몬, 자몽 텀가 여부를 손님에게 묻는다.
	 	-레몬 : 레몬티, 자몽 : 자몽티
	 5. 홍차를 제공한다
	 	-고객님 []티가 나왔습니다.
	 * */
	private String Tea, msg;
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다.");
		
	}

	@Override
	public void brew() {
		System.out.println("티백을 내린다.");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다.");
		
	}

	@Override
	public void select(int option) {
		switch (option) {
		case 3:
			this.Tea = "레몬"; break;
		case 4: 
			this.Tea = "자몽"; break;
		default:
			this.Tea = "선택오류"; break;
		}
		
	}

	@Override
	public String serve() {
		msg = "\n.\n.\n.\n고객님~ "+this.Tea+"티 가 나왔습니다.";
		return msg;
	}

}
