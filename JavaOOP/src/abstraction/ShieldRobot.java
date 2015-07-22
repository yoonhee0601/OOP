package abstraction;

public class ShieldRobot extends BasicBot {
	private int ShieldPoint;
	public static String NAME = "쉴드로봇";
	
	
	
	
	public int getShieldPoint() {
		return ShieldPoint;
	}
	public void Shield(int ShieldPoint) {
		this.ShieldPoint = ShieldPoint;
	}
	@Override
	public void status() {
		System.out.print(NAME+"은 ");
		super.status();
		System.out.println(", 방어력은 "+ getShieldPoint());
	}
	
}
