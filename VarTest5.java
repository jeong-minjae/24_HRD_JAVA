package day01;
import java.util.Scanner;
/* 
 * 4칙 연산과 나머지 연산을 하는 간단한 게산기 예제
 */
public class VarTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4칙 연산을 입력받아 저장하는 변수 선언 
		
		//2.2개정수 입력받아 저장하는 변수 선언
		
		//3. 더하기면 덧셈 빼기면 뻴셈 ,
		Scanner sc =new Scanner(System.in);
		int hap=0;
		System.out.println("첫번째 정수입력");
		int num1=sc.nextInt();
		System.out.println("두번쨰 정수입력");
		int num2=sc.nextInt();
		System.out.println("연산자입력");
		String result=sc.next() ;
		
		if(result.equals("+")) {
			hap=num1+num2;
		}else if(result.equals("-")) {
			hap=num1-num2;
		}else if(result.equals("*")) {
			hap=num1*num2;
		}else if(result.equals("/")) {
			hap=num1/num2;
		}else if(result.equals("%")) {
			hap=num1%num2;
		}
		System.out.println(hap);
		
		
		
	}

}
