package polymorphism;

public class SamsungTV implements TV {
	public void initMethod() {
		System.out.println("按眉 檬扁拳 累诀 贸府");
	}

	public void destoryMethod() {
		System.out.println("按眉 昏力 傈俊 贸府且 肺流 贸府");
	}

	public SamsungTV() {
		System.out.println("===> SamsyngTV) 按眉 积己");
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
