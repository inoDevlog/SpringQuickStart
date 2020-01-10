package polymorphism;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성됨");
	}

	public void volumeUp() {
		System.out.println("AppleSpeaker---UP");

	}

	public void volumeDowm() {
		System.out.println("AppleSpeaker---DOWN");

	}

}