package day02;
import java.util.Scanner;
public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/* 
		 * 1번 종속 2.감속 3.중지
		 */
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int speed=0;
		while(true) {
			System.out.println("========================");
			System.out.println("1번 종속 2.감속 3.중지");
			System.out.println("=========================");
			System.out.print("선택:");
			String num=sc.next();
			if(num.equals("1")) {
				speed++;
				System.out.println("현재속도는"+speed);
			}else if(num.equals("2")) {
				speed--;
				System.out.println("현재속도는"+speed);
			}else if(num.equals("3")) {
				run=false;
				break;
				
			}
			
		}
		System.out.println("프로그램 종료");
			
	}

}
