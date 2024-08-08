package day03;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int [] score= null;
	
		int maxscore=0;
		int avgscore=0;
		int sum=0;
		int student=0;
		
	
	while(true) {
	System.out.println("------------------------------------------------");
	System.out.println("1.학생수 |2.점수입력|3.점수리스트|4.분석|5.종료");
	System.out.println("------------------------------------------------");
	System.out.println("선택>");
		String se =sc.nextLine();
		
		
		if(se.equals("1")) {
			
			System.out.print("학생수");
			 student=Integer.parseInt(sc.nextLine());
			  score= new int[student];
			
			
			
		}else if(se.equals("2")) {
			for(int i=0;i<score.length;i++) {
				System.out.println("score"+"["+i+"]>");
				score[i]=Integer.parseInt(sc.nextLine());
			}
			
			
		}else if(se.equals("3")) {
			for(int i=0;i<score.length;i++) {
				System.out.println("score"+"["+i+"]:"+score[i]);
			}
			
			
		}else if(se.equals("4")) {
			maxscore=score[0];
			for(int i=0;i<score.length;i++)
			{
				if(score[i]>maxscore) {
					maxscore=score[i];
				}
			}
			System.out.println("최고점수"+maxscore);
			for(int i=0;i<score.length;i++)
			{
				sum += score[i];
				avgscore=sum/ score.length;
			}
			
			System.out.println("평균점수"+avgscore);
			
		}else if(se.equals("5")) {
			System.out.println("프로그램 종료");
			break;
		}
			
	}
	}

}
