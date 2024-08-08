package day03;

public class Car {

	
	
	//속성 
	String compuny="정민재";
	String corol;
	String model;
	int maxspeed;
	
	int rpm;
	int speed;
	
	//기본 생성자 
	public Car() {
		
	}
	//인자 생성자(오버로딩)
	public Car(String compuny,String model,String corol,int maxspeed) {
		this.compuny =compuny;
		this.model=model;
		this.corol=corol;
		this.maxspeed=maxspeed;
	}
	public Car(String compuny,String model,String corol) {
		this(compuny,model,corol,200);
	}
		
	//메소드
	void Carinfo(){
		System.out.println("===================");
		System.out.println("제조회사"+compuny);
		System.out.println("색깔"+corol);
		System.out.println("모델"+model);
		System.out.println("최고 속력"+maxspeed);
		
	}
	
}
