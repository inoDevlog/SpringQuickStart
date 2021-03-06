package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	@Autowired
	private Speaker speaker;

	public LgTV() {
		System.out.println("===> LgTV 객체 생성됨");
	}

	public void powerOn() {
		System.out.println("LgTV -- ON");
	}

	public void powerOff() {
		System.out.println("LgTV -- OFF");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDowm();
	}
}