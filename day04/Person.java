package day04;



public class Person {

//객체 모델링 구성요소 (클래스 맴버) 
		
	//속성- has a 했을때 어색하지 않는거 
	int age;
	String name;
	char gender;/// F, M
	String tel;
	
	
	
	//기본 생성자
	public Person() {
		
	}
	
	
	
	//get ,info
	
	void getinfo() {
		System.out.println(this.name+"님 정보----");
		System.out.println("나이"+this.age);
		System.out.println("성별"+this.gender);
		System.out.println("전화번호"+this.tel);
	}
	//메소드 
	void 웃다() {
		System.out.println("웃는다");
	}
	void 먹다() {
		System.out.println("먹는다");
	}
	
	
	
	

}