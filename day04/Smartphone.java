package day04;

public class Smartphone extends Phone {
	//필드선언
	public boolean wifi;
	
	//생성자 선언

	public Smartphone(String model,String color) {
		super(model,color);
		
	}
	
	
	@Override
	public void bell() {
		System.out.println("랭딩동");
	
	}


	public void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태를 변경하였습니다");
		
		
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	}
	
}
