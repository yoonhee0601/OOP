package inhebitance;

import java.util.Scanner;

import org.omg.PortableServer.AdapterActivator;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("통화 상대 : ");
		String name = scanner.next();
		System.out.println("메세지 : ");
		String msg = scanner.next();
		androidPhone.setOs(""); // 사용자가 이후 액션도 하지 않고
		// 스캐너를 입력한 하면 OS 는 android 가 setting 되게 만듦
		androidPhone.setData(name, msg);
		System.out.println(androidPhone.getData());
	}
}
