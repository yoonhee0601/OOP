package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자();
		 * */
		System.out.println("밀크커피: 1, 블랙커피: 2, 레몬티: 3, 자몽티: 4");
		Scanner scanner = new Scanner(System.in);
		
		Recipe coffee = new Coffee(); // 인터페이스에 있는 메소드만 쓰고 추가 안됨
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		coffee.select(scanner.nextInt());
		System.out.println(coffee.serve());
		Recipe tea = new Tea();
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
	
		tea.select(scanner.nextInt());
		System.out.println(tea.serve());
	}
}
