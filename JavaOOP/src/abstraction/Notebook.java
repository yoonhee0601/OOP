package abstraction;
/*
@Date : 2015.07.21
@Author : me
@Story : 추상적 "제품"이라는 개념을 인터페이스로 만듦
* */
public class Notebook extends ProductSpec {
	private String cpu; // CPU  사양
	private String ram; // 메모리 사양
	private String hdd; // 하드디스크 사양
	
	public void writeInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		
		super.writeInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("CPU 정보 : "+ this.cpu);
		System.out.println("메모리 정보 : "+ this.ram);
		System.out.println("하드디스크 정보 : "+ this.hdd);
		}
}
