package abstraction;
/*
 @Date : 2015.07.21
 @Author : me
 @Story : 추상화 + 다양성의 결합형태 보는 예제(과일)
 * */
public interface FruitInterface {
/*
 객체지향 언어에서 다양성은 핵심원리
 -인터페이승를 구현하는 클래스들은 그 인터페이스 타입에 포함이 된다.
 -아래와 같은 상속의 예에서
 class Child extends Parent 가 있다고 하면
 Child 가 Parent 의 타입에 포함(종속)됩니다.
  이처럼 인터페이스도 그를 구현(implements) 한 인터페이스 타입에 포함이 된다.
 * */
	public void display(String str);
}
