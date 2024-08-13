package day06;

public abstract class Product {
	//필드 
	String Pname; 
	int price;
	//매소드
	
	public void printdetail() {
		System.out.println("상품명"+Pname+",");
		System.out.println("가격:"+price+",");
		printExtra();
	}
	
	
	public abstract void printExtra();
	
	
	
	
}
