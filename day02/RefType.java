package day02;

public class RefType {

	public static void main(String[] args) {
		
		
		RefType ref = new RefType();  //스택에 쌓인다 지역변수 블럭 안에 선언된 변수이기 때문에  힙에 ref타입 할당 
		RefType ref2 =new RefType();  //생성자 스택에는 지역변수 2개 쌓인다 힙메모리에 새로운공간에 ref2 할당  같은 클래스라고 하더라도 각각에 참조형변수는 다른걸 가르킨다 
		if(ref==ref2) {
			System.out.println("동일한 주소를 갖는 객체입니다");
		}else {
			System.out.println("서로다른 주소를 갖는 객체입니다");
			
		}
		
			String name =new String("홍준재");
			System.out.println(name);
			
			String name2="오늘도 수고했어요";
			String name3= name2.replace("오늘도", "내일도");
			System.out.println(name3);
			System.out.println(name2.length());
			
			int [] score=new int[5];
			score[0]=10;
			score[1]=20;
			score[2]=30;
			score[3]=40;
			score[4]=50;
			int hap=0;
			for(int i=0;i<score.length;i++) {
			hap= hap+score[i];
			
	}
			System.out.println(hap);
	}
}
