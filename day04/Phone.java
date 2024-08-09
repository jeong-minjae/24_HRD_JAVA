package day04;

public class Phone {

	
	public String model;
	public String color;
	
	public Phone(String model,String color) {
		this.model=model;
		this.color=color;
	}
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	public void sendVoice(String messege) {
		System.out.println("자기"+messege);
	}
	
	public void reciveVoice(String messege) {
		System.out.println("상대방"+messege);
	}
	
	public void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
