package day04;

public class Account {

	
	//밸런스 은닉화하기 
	String name;
	String to;
	int po;
	private int  money;
	private String owner;
	private String balance;
		
	
	
	//기본생성자
	public Account(){
		
	}
	
	
	//상수 필드 정의하기
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000; //final 붙여주고 대문자 붙여줘야한다 
	//getter setter 메소드 정의하기
	
	public int getBalnce(){
		
		
		return money;
		
	}
	
	public void setBalane(int balance) {
		if(balance<Account.MIN_BALANCE||balance>Account.MAX_BALANCE) {
			return;
		}
		this.balance=balance;
	}
	
	
	
	
	void getinfo() {
		System.out.println(this.name+"님 정보----");
		System.out.println("계좌번호"+this.to);
		System.out.println("계좌주"+this.name);
		System.out.println("초기입금액"+this.po);
		
	
	
}
	
}