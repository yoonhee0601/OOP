package abstraction;

public class GunRobot extends BasicBot{
	private int attackPoint;
	public static String NAME = "건로봇";

	
	
	public void setAttackPoint(int attackPoint) { // set 만들기 편해서 만든 듯...? 
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		System.out.print(NAME+"은 ");
		super.status();
		System.out.println(", 공격력은 "+this.attackPoint);
	}
	
}
