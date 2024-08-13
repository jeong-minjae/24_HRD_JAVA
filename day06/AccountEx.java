package day06;


class Account{
	
	//에ㅐ금하기 
	 int balance;
	public void depositint(int money) {
		
		balance+= money;
	}
	
	
	
	
	//출금하기
	
	public int getBalance() {
		return balance;
	}




	

public void withdraw (int money) throws InsufficienException{
		if(balance<money) {
			throw new InsufficienException("잔고부족"+(money-balance)+"모자람");
		}
		balance -=money;
	


	}
	
}

public class AccountEx {

	public static void main(String[] args) {
		Account account =new Account();
		
		
		account.depositint(10000);
		System.out.println("예금액:"+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(InsufficienException e){
			String messege =e.getMessage();
			System.out.println(messege);
		}
	}

}
