package day02;
import java.util.Scanner;
public class IfExam2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		
		int select;
		System.out.println("##메뉴선택##");
		System.out.println("1.구매자 2.판매자");
		System.out.println("메뉴를 선택해주세요");
		select=sc.nextInt();
		if(select==1) {
			System.out.println("구매자로 로그인하셨습니다");
		}else if(select==2) {
			System.out.println("판매자로 로그인하셨습니다");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

}
