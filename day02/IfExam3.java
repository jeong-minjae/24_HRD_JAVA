package day02;
import java.util.Scanner;
public class IfExam3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		
		
		System.out.println("##admin 혹은 임의 아이디##");
		System.out.print("1.로그인 아이디:");
		String log=sc.next();
		
		if(log.equals("admin")) {
			System.out.println("관리자 로그인");
			System.out.println("메뉴를 선택해주세여1~2");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("admin 1번 선택함");
			}else if(select==2) {
				System.out.println("admin 2번 선택함");
			}
		}else  {
			System.out.println(log+" 로그인하셨습니다");
			System.out.println("메뉴를 선택해주세여1~2");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println(log+" 1번 선택함");
			}else if(select==2) {
				System.out.println(log+" 2번 선택함");
			}
		}

	}

}
