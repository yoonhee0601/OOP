package abstraction;

public class BasicBot implements Robot{
	/*===== 필드 =====*/
	private int energy;
	private int speed;
	
	
	/*===== 생성자 =====*/
	/*===== 멤버메소드 =====*/
	
	@Override
	public void charge(int energy) {
		this.energy += energy;
		
	}
	
	@Override
	public void run(int speed) {
		this.speed += speed;
		
	}
	@Override
	public void status() {
		System.out.print("속도는 "+this.speed+", 에너지는 "+this.speed);

	}
}
