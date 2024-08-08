package day03;

public class CalculatorTest {

	public static void main(String[] args) {
		
		 Carculator cal =new  Carculator();
		 
		 cal.x=150;
		 cal.y=20;
		 
		 //메소드 호출 
		 System.out.println("더하기"+Carculator.add(cal.x, cal.y));
		 cal.minus(150, 60);
		 
		 System.out.println("곱하기"+cal.multi());
		 cal.div();
		 
		 
		 
		 //정사각형 넓이 구하기 
		 
		 double result=10*10*Carculator.pi;
		 
		 
		 //직사각형 넓이 구하기
		 double result1 =cal.areaRect(10, 20);
		 
		 System.out.println(result);
		 System.out.println(result1);
		
	}
	

}
