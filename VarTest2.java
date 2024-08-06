package day01;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 변수 2개 선언하기  i,j
		//문자열 변수 1개 선언하기 var1 
		//문자형 변수 1개 선언하기 var2
		
		//정수형 변수 1개와 문자열변수 연결해서 출력하기 
		
		int i=20;
		int j=3;
		
		String var1="정민재";
		String var2="A";
		
		System.out.println(i+var2);
		System.out.println(var1);
		
		
		//강제 형변환 
		double k=3.141592;
		j=j+(int)k; //강제 형변환
		System.out.println("j:"+j+"\nK:"+k);
	}

}
