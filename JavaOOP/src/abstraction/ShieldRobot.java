package abstraction;

public class ShieldRobot extends BasicBot {
	private int ShieldPoint;
	public static String NAME = "쉴드로봇";
	
	
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
	
	public int getShieldPoint() {
		return ShieldPoint;
	}
	public void setShieldPoint(int ShieldPoint) {
		this.ShieldPoint = ShieldPoint;
	}
	@Override
	public void status() {
		System.out.print(NAME+"은 ");
		super.status();
		System.out.println(", 방어력은 "+ getShieldPoint());
	}
	
}
