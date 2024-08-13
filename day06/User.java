package day06;

public class User {

	private String name;
	Paytype payType;
	
	public User(String name,Paytype payType) {
		this.name=name;
		this.payType=payType;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Paytype getPayType() {
		return payType;
	}

	public void setPayType(Paytype payType) {
		this.payType = payType;
	}

	
}
