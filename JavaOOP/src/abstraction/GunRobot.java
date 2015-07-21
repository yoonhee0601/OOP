package abstraction;

public class GunRobot extends BasicBot{
	private int attackPoint;
	public static String NAME = "건로봇";

	
	
	@Override
	public void charge(int energy) {
		// TODO Auto-generated method stub
		super.charge(energy);
	}
	@Override
	public void run(int speed) {
		// TODO Auto-generated method stub
		super.run(speed);
	}
	public int getAttackPoint() {
		return attackPoint;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		System.out.print(NAME+"은 ");
		super.status();
		System.out.println(", 공격력은 "+getAttackPoint());
	}
	
}
