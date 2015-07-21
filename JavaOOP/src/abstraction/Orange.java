package abstraction;
/*
@Date : 2015.07.21
@Author : me
@Story : 추상화 + 다양성의 결합형태 보는 예제(과일)
* */
public class Orange implements FruitInterface {

	@Override
	public void display(String str) {
		System.out.println(str + " 오렌지 입니다.");
	}
	public int count(){ 
		// int 는 return 타입 입니다, void 가 아니라면 
		// 반드시 return 키워드를 사용해야 한다.
		// return 타입이 존재할 때 코딩하는 방법
		// 1.리턴 타입의 지변을 초기화 한다.
		int count = 100;
		// 2.return  키워드 뒤에 지변을 둔다.
		return count;
	}
}
