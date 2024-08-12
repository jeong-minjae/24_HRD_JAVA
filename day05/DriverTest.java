package day05;


 interface Vehicle{
	
	public void run();
}
 
 
 class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	
	
	 
 }
 
 class Taxi implements Vehicle{
	 @Override
	public void run() {
		System.out.println("택시가 달린다");
		
	}
 }
 //다형성
 class Drive{
	 void drive(Vehicle v) {
		 System.out.println("운전자");
		 v.run();
	 }
 }
 
public class DriverTest {

	public static void main(String[] args) {
	
			Drive driver =new Drive();
			Bus bus =new Bus();
			driver.drive(bus);
			driver.drive(new Taxi());
			
	}

}
