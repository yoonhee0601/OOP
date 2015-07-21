package abstraction;
/*
@Date : 2015.07.21
@Author : me
@Story : 추상화 + 다양성의 결합형태 보는 예제(과일)
* */
public class FruitMain {
	public static void main(String[] args) {
		/*
		 ★ ★ ★ 인터페이스는 객체를 만들 수 없다.
		 fruitsInerface f = new f...();
		 [중요문법]
		 인터페이스를 구현한 클래스의 객체생성은
		 인터페이스명(타입) 인스턴스 = new 생성자();
		 * */
		FruitInterface apple = new Apple();
		FruitInterface banana = new Banana();
		FruitInterface orange = new Orange();
		
		apple.display("맛있는 ");
		banana.display("오래된");
		orange.display("비싼");
		/*
		 orange.count();
		 인터페이스 타입으로 선언되어 생성된 객체 (인스턴스)에서
		 인터페이스에 선언됮 않은 메소드를 호출할 지라도 
		 그 메소드는 호출되지 않는다.
		 이처럼 하는 이유는 기획자 (아키텍처) 가
		 일선 개발자들이 자기 마음대로 메소드를 선언하여
		 기획자 의도에 벗어나는 것을 막고, 주어진 메소드를 
		 통해 코드를 구현하는 것을 암묵적으로 제약, 지시 한다.
		 * */
		
	}
}
