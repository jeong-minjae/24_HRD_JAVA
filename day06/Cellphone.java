package day06;

public class Cellphone extends Product{

	String carrier;
	
	public Cellphone(String Pname, int price,String carrier) {
		this.Pname=Pname;
		this.price=price;
		this.carrier=carrier;
		
	}

	@Override
	public void printExtra() {
		System.out.println("통신사:"+carrier);
		
	}

	
	
	
	
}
