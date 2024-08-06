package day01;
import java.util.Scanner;

public class VarTest1 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in); //앞에있는 클래스 이름과 생성자 이름이 똑같다
		
		
		
		// TODO Auto-generated method stub
		// 실행문은 변수 선언 변수값 저장 메소드 호출에 해당하는 코드
		//실행문 끝에는 반듯 ㅣ세미콜론을 붙여 실행문의 끝표시
		
		//정수변수
		int x;
		//변수 초기화
		x =5;
		System.out.print("첫번째 정수 입력: ");
		x=scan.nextInt(); //정수값을 읽어온다 
		
		int y=8;
		
		System.out.print("두번째 정수 입력: ");
		
		y=scan.nextInt(); //정수값을 읽어온다 
		
		int result =x+y;
		
		System.out.println(result);
		
			//2 실수변수
		
			// float(4byte),double(8byte)
			
		double height=155.7;
		System.out.print("키 입력: ");
		
		height=scan.nextDouble(); 
		
		float weight =45.5f; // float를 쓸경우 f를 마지막에 붙여줘야한다
		
		System.out.print("몸무게 입력: ");
		
		weight=scan.nextFloat(); 
		
		
		//3.문자형 변수
		//char
		
		//4. 문자열변수 
		//String
		String name =" ";
		System.out.print("이름을 입력하세여: ");
		
		name=scan.next(); //정수값을 읽어온다 
		
		char blood ='A';// 문자는 작은따음표
		
		//5. 논리형 변수 
		
		//boolean
		boolean stop =true;
		
		if(stop == true ) {
		System.out.println("중지합니다");
			
		}else {
			System.out.println("시작합니다");
		}
			
		
		System.out.print("키:"+height+"\n몸무게:"+weight+"\n");// 변수와 문자열 사이를  연걸시키려면 +를 사용해야한다 
		
		System.out.println("혈액형:"+blood+"형 입니다");
		
		System.out.println("이름:"+name+" 입니다");
	}

}
