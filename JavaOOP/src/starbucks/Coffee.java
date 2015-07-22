package starbucks;

public class Coffee implements Recipe {
	
	/* 커피 끓이는 순서
	 1. 물을 끓인다.
	 2. 커피를 내린다.
	 3. 물을 컵에 붓는다.
	 4. 설탕 첨가 여부를 손님에게 묻는다
	 	-무설탕: 블랙, 설탕:밀크
	 5. 커피를 제공한다
	 	-고객님 []커피가 나왔습니다.
	 */
	private String coffee;
	private String msg;
	


	@Override
	public void boilWater() {
		System.out.println("물을 끓인다\n.\n.\n.");
		
	}

	@Override
	public void brew() {
		System.out.println("커피를 내린다\n.\n.\n.");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("컵에 물을 붓는다\n.\n.\n.");
		
	}
	
	
	@Override
	public void select(int option) {
	
		switch (option) {
		case 1:
			this.coffee = "밀크커피"; break;
		case 2:
			this.coffee = "블랙커피"; break;
		default:this.coffee ="선택오류"; break;
		}
	}
	

	@Override
	public String serve() {
		msg = "\n.\n.\n.\n고객님~ "+this.coffee+" 가 나왔습니다.";
		return msg;
	}

}
