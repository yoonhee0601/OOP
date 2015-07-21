package abstraction;
/*
@Date : 2015.07.21
@Author : me
@Story : 추상적 "제품"이라는 개념을 인터페이스로 만듦
* */
public class TV extends ProductSpec {
	// 주어진 것만 하라고 했으면 ProductSpec에서 마무리
	// 그런데 추가정보를 더하라고 했으면 상속
	private String screenSize;
	private String screenType;
	
	public void writeInfo(String company, String name, String serialNo, String screenSize, String screenType) {
		
		super.writeInfo(company, name, serialNo);
		// 부모에게 선언된 public  메소드에 접근, 사용가능
		// super 라는 키워드를 통해서...
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스크린 사이즈 :"+ this.screenSize);
		System.out.println("스크린 타입 :"+ this.screenType);
	}
}
