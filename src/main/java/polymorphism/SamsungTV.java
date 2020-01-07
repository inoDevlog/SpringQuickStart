package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker()");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice()");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV -- ON ( : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV -- OFF");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDowm();
	}
}
