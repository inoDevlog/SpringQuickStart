package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	public void powerOn() {
		System.out.println("LgTV -- ON");
	}

	public void powerOff() {
		System.out.println("LgTV -- OFF");
	}

	public void volumeUp() {
		System.out.println("LgTV -- UP");
	}

	public void volumeDown() {
		System.out.println("LgTV -- DOWN");
	}

}
