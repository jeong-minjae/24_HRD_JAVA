package day04;
import java.util.Scanner;
public class BankApp {
	
	
	private static Scanner sc=new Scanner(System.in);
		private static Account account=new Account();
	
		String[] aco =new String[100];
	

	public static void main(String[] args) {
		
		/*account.setBalane(10000);
		System.out.println("현재잔고 "+account.getBalnce());
		account.setBalane(-10000);
		System.out.println("현재잔고"+account.getBalnce());
		account.setBalane(300000);
		System.out.println("현재잔고 "+account.getBalnce());*/
		
		
		
		while(true) {
		
		System.out.println("****************************************");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("****************************************");
		System.out.print("선택>");
		int se=Integer.parseInt(sc.nextLine());
	
		
		if(se==1) {
			
			
		}else if(se==2) {
			
			
			
			
		}else if(se==3) {
			
		}else if (se==4) {
			
		}else if(se==5){
			System.out.println("프로그램 종료");
			break;
		}
		
		}
		
	}

	private static void createAccount() {
		System.out.println("계좌 생성");
		
		System.out.print("계좌번호");
		String ac=sc.nextLine();
	
		System.out.println("계좌주");
		String ac1=sc.nextLine();
		
		System.out.println("초기 입금액");
		int mo=Integer.parseInt(sc.nextLine());
		
	}
	
	
	
}



