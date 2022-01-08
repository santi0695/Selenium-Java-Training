package week3.day1.classroom1;

public class AndroidPhone extends SmartPhone {

	public void takeVideo( ) {
		System.out.println("Video has been captured in AndroidPhone");
	}
	
	public static void main(String[] args) {
		
		AndroidPhone moto = new AndroidPhone();
		moto.sendMsg();
		moto.makeCall();
		moto.saveContact();
		moto.accessWhatsapp();
		moto.takeVideo();
		
		Mobile mob = new Mobile();
		mob.sendMsg();
		
		SmartPhone smp = new SmartPhone();
		smp.takeVideo();
		
				
	}
	
}
