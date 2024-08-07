package day02;

public class ForExam2 {

	public static void main(String[] args) {
		//1에서 100까지 짝수들의 총합을 계산하여 출력하시오
		int i;
		int hap=0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				hap=hap+i;
			}
		}
		System.out.println("0에서 100까지 짝수들의 합은?:"+hap);

	}

}
