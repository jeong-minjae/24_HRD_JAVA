package day05;

//abstract class Animal{
	//추상 클래스 적어도 한개이상의 추상매소드를 갖는 클래스 
	//추상매소드 :바디가없는 매소드 {}
	//abstract void sound(); //중괄호가없는게 특징
	
	
	
	
//}

  interface  Soundable{
	public String sound();
}
  
  

class Dog implements Soundable{

	@Override
	public String sound() {
		
		return "멍 멍";
	}
	
	
}

class Cat implements Soundable{

	@Override
	public String sound() {
		
		return "야옹";
	}
	
	
}




public class AnimalTest {

	
	public static void Sound(Soundable soundable){
		System.out.println(soundable.sound());
			
		
}
	public static void main(String[] args) {
		
		//추상클래스는 객체를 생성할수없다
		
		AnimalTest.Sound(new Dog());
		AnimalTest.Sound(new Cat());
		
		
	}

}
