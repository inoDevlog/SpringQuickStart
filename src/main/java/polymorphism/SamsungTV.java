package polymorphism;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("===> SamsyngTV) ��ü ����");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV -- ON");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV -- OFF");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV -- UP");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV -- DOWN");
	}
}
