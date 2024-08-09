package day04;

public class CarExam {

	
	public static void main(String[] args) {
		
		Car car =new Car();
		car.tire=new Tire();
		car.run();
		
		car.tire  =new HankookTire();	
		car.run();
		
		car.tire =new KuhoTire();
		car.run();
		car.setSpeed(100);
		car.setStop(false);	
		
		System.out.println(car.getSpeed());
		System.out.println(car.getStop());
	}

}

class Car {
		//캡슐화 정보은닉
		private int speed;
		private boolean stop;
		Tire tire;
		
		public void run() {
			tire.roll();
		}
		//seter 메소드 정의 필드 값 변경하는 메소드
		public void setSpeed(int speed) {
			this.speed=speed;
			
		}
		
		public void setStop(boolean stop) {
			this.stop=stop;
		}
		
		
		public int getSpeed() {
			return speed;
		}
		public boolean getStop() {
			return stop;
		}
		
	}
