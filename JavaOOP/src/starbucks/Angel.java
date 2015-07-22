package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		AngelCoffee kim = new AngelCoffee();
		//System.out.println("밀크커피: 1, 블랙커피: 2");
		//kim.prepare(scanner.nextInt());
		AngelCoffee lee = new AngelCoffee();
		System.out.println("레몬티: 3, 자몽티: 4");
		lee.prepare(scanner.nextInt());
	}
}
