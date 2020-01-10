package polymorphism;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성됨");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker---UP");
	}

	public void volumeDowm() {
		System.out.println("SonySpeaker---DOWN");
	}

}
