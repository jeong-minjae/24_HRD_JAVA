package day03;
//맴버 변수 선언




//기본 생성자 선언
public class Carculator {
	int x,y;
	static double pi=3.14159;

//반환 타입도 있고 매개변수도 있는 매소드 정의
	static int add(int x,int y) {
		return x+y; //반환을 해야하면 리턴문을 포함해야한다
		
		
	}
	
	public Carculator() {
		
	}
	//반환 타입은 없고 메개변수는 있는 메소드 정의 
	public void minus(int x,int y) {
		System.out.println(x-y);  //반환 타입이 없으면 결과는 시스아웃으로 포함시켜줘야함
	}
	
	// 반환 타입은 있거 매개변수는 없는 매소드정의
	int  multi() {
		return x * y;
	}
	
	//반환 타입과 매개변수가 없는 정의
	
	void div() {
		System.out.println(x/y);
	}
	
	//정사각형의 넓이 구하는 메소드정의 
	
	double areaRect(double width) {
		return width=width;
	}
	
	double areaRect(double width,double height) {
		return width*height;
	}
			
	
	
	
	
	
	
	
	
	
	
}
