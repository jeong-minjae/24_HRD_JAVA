package day03;

public class ArrayEXam {

	public static void main(String[] args) {
		//문자열 데이터 4개를 저장할 배열 선언 
		String [] season= {"spring","summer","fall","winter"};
		for(int i=0;i<4;i++) {
			System.out.println(season[i]);
		}
		
		season[1]="여름";  //시즌 이름 변경 
		for(int i=0;i<4;i++) {
			System.out.println(season[i]);
		}
		
		
		//이름 문자열 3개를 저장할 배열 선언 및 초기화
		
		
		String[] names=null;  //모든 참조형값은 null
		
		names=new String[] {"홍준오","이현수","정민재"};
		
	}

}
