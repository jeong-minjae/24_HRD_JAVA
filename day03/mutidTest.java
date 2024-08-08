package day03;

public class mutidTest {

	public static void main(String[] args) {
		//2차원배열생성
		int [][] scores={
			{80,90,96},
			{76,88}
		};
		//배열의 길이
		System.out.println("1차원 배열 길이 (반의수)"+scores.length);
		System.out.println("2차원 배열 길이 (첫번째 반의 학생수"+scores[0].length);
		System.out.println("2차원 배열실이 (두번째 반의 학생수)"+scores[1].length);
		
		//첫번째 반의 세번째 방의 학생점수일기 
		System.out.println("scores[0][2]"+scores[0][2]);
		System.out.println("scors[1][1]"+scores[1][1]);
		
		//첫번째 방의 평균 구하기 
		int classnumber=0;
		for(int i=0;i<scores[0].length;i++) {
			classnumber += scores[0][i];
		}
		double class1Avg=(double)classnumber/scores[0].length;
		System.out.println("첫번째 반의 평균 점수 "+class1Avg);
		
		int classnumber2=0;
		for(int i=0;i<scores[1].length;i++) {
			classnumber2 += scores[1][i];
		}
		double class2Avg=(double)classnumber2/scores[1].length;
		System.out.println("두번째 반의 평균 점수 "+class2Avg);
		
		int totalst=0;
		int totalsu=0;
		for(int i=0;i<scores.length;i++) {
			totalst +=scores[i].length;
			for(int k=0;k<scores[i].length;k++) {
				totalsu+=scores[i][k];
			}
		}
		
		double totalavg =(double)totalsu/totalst;
		System.out.println("전체 학생의 평균점수"+totalavg);
		
		
		
	}

}
