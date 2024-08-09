package day04;

public class SmartphoneEX {

	public static void main(String[] args) {
		Smartphone myphon=new Smartphone("갤럭시","은색");
		
		
		System.out.println("모델"+myphon.model);
		System.out.println("컬러"+myphon.color);
		
		System.out.println("와이파이 상태"+myphon.wifi);
		
		myphon.bell();
		myphon.sendVoice("여보세여");
		myphon.reciveVoice("안녕하세여 저는 홍준오인데여");
		myphon.sendVoice("안녕하세여");
		myphon.hangup();
		
		myphon.setWifi(true);
		myphon.internet();

	}

}
