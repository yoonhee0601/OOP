package abstraction;

import java.util.Scanner;

import javax.print.attribute.standard.SheetCollate;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력 50
		 -공격력은 인스턴스 변수로 int attackPoint
		 쉴드로봇은 속도는 20, 에너지는 20, 방어력 50
		 - 방어력은 인스턴스 변수로 int ShieldPoint
		 * */
		GunRobot gunRobot = new GunRobot();
		ShieldRobot shieldRobot = new ShieldRobot();
		Scanner scanner = new Scanner(System.in);
		System.out.println(GunRobot.NAME+" 의 ");
		System.out.println("속도를 입력하시오");
		gunRobot.run(scanner.nextInt());
		System.out.println("에너지를 입력하시오");
		gunRobot.charge(scanner.nextInt());
		System.out.println("공격력을 입력하시오");
		gunRobot.setAttackPoint(scanner.nextInt());
		
		System.out.println("\n"+ShieldRobot.NAME+" 의 ");
		System.out.println("속도를 입력하시오");
		shieldRobot.run(scanner.nextInt());
		System.out.println("에너지를 입력하시오");
		shieldRobot.charge(scanner.nextInt());
		System.out.println("방어력을 입력하시오");
		shieldRobot.Shield(scanner.nextInt());
		
		gunRobot.status();
		shieldRobot.status();
		
		Robot[] robots = new Robot[2];
		robots[0] = gunRobot;
		robots[1] = shieldRobot;
		// 확장된 for 문 
		for (Robot robot : robots) {
			robot.status();
		}
	}
}
