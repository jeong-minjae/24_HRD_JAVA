package day02;
import java.util.Scanner;
public class Game3 {

	public static void main(String[] args) {
		//문제2 :continue믄 :369 게임 
		//1부터 10까지 정수 출력중 3 ,4,9,일때 박수소리를 출력하는 프로그램 작성하기 
		Scanner sc=new Scanner(System.in);
		int num1;
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				System.out.print("짝");
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
 