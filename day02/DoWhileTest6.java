package day02;
import java.util.Scanner;
public class DoWhileTest6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("메세지를 입력해주세요");
		System.out.println("종료하려면 q 를 입력하세여");
		String me="";
		do {	
			 me=sc.next();
			System.out.println(me);
		}while(!me.equals("q"));
		System.out.println("종료합니다");
	}

}
