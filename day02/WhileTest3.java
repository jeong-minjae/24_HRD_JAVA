package day02;

public class WhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		
		while(i<=20) {
			System.out.println(i--);
			
			
			if(i==3) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}

}
