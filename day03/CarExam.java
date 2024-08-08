package day03;

public class CarExam {

	public static void main(String[] args) {
		
		
		Car mycar=new Car();
		mycar.compuny="람보르기니";
		mycar.corol="노랑";
		mycar.maxspeed=256;
		mycar.model="쿤타치";
		
		//메소드 호출
		mycar.Carinfo();
		
		
		
		Car mycar2 = new Car("람보르기니","우르스","파랑",256);
		mycar2.Carinfo();

	}

}
