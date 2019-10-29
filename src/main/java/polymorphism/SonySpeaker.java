package polymorphism;

public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("===> SonySpeaker °´Ã¼ »ý¼º");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker---UP");
	}

	public void volumeDowm() {
		System.out.println("SonySpeaker---DOWN");
	}

}
