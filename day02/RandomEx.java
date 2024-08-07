package day02;
import java.util.Random;
import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		//임의에 수를 생성과 수를 다루는 내장 객체 -> random 클래스 
		// 참조형 변수 선언으로 생성한다.
		Random ra=new Random();
		
		
		//1~45번까지 수 생성하기 
		for(int i=1;i<=6;i++) {
			
			int num=ra.nextInt(46)+1;
		System.out.println(num);
			
		}
		
	}

}
