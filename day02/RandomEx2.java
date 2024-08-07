package day02;
import java.util.Scanner;
import java.util.Random;
public class RandomEx2 {

	public static void main(String[] args) {
	//가위 바위 보 게임 만들기
		//1~3까지의 난수를 생성하여 1:가위 2:바위3:보
		//컴퓨터 유저간 게임을 하여 승 패 를 출력하시오 
		//변수 자료형 조건문 반복문 Scanner Random 클래스 사용하기
		
		
		Random ra=new Random();
		Scanner sc=new Scanner(System.in);
	
		
		while(true)
		{
			System.out.println("1:가위 2:바위 3:보");
			int user =sc.nextInt();
			int num=ra.nextInt(3)+1;
		
			System.out.println("내가낸것"+user);	
			System.out.println("컴퓨터가 낸것"+num); //숫자 1~3까지 랜덤생성 
			
			if(user==0) System.exit(0); //프로그램 정상종료 
			if(user==num) {
				System.out.println("비겼습니다!");
			}else if((user==1)&&(num==3)||
				(user == 2)&&(num==1)||
				(user == 3)&&(num==2)){//유저가 이길경우 && || 활용하여 여러가지 승리상황 합치기 
				System.out.println("이겼습니다!");
			}else {//그외 유저 패배 
				System.out.println("졌습니다");
			}
			
				
			
			
		}
		
	}

}
