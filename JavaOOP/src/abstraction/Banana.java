package abstraction;
/*
@Date : 2015.07.21
@Author : me
@Story : 추상화 + 다양성의 결합형태 보는 예제(과일)
* */
public class Banana implements FruitInterface {

	@Override
	public void display(String str) {
		System.out.println(str + " 바나나 입니다.");
	}

}
