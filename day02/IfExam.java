package day02;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int jumsu=50;
		System.out.println("학점를 입력해주세요");
		jumsu=sc.nextInt();
		if(jumsu>=95) {
			System.out.println("A+");
		}else if(jumsu>=90) {
			System.out.println("A");
		}else if(jumsu>=85) {
			System.out.println("B+");
		}else if(jumsu>=80) {
			System.out.println("B");
		}else if(jumsu>=75){
			System.out.println("C+");
			
		}else if(jumsu>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		

	}

}
