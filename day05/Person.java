package day05;

public class Person {
//이름 나이 ,정보 은닉화
	private String name ;
	private int age;
	
	//인자 생성자 
	public  Person(String name,int age) {
		this.age=age;
		this.name=name;
		
	}
	
	public Person() {
		
	}
	
	//getter setter
	public void setName(String name ) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
	
	//이름 나이 정보를 반환하는 메소드  personinfo
	
	public String Personinfo() {
		String info="이름:"+name+"\n나이:"+age;
		return info;
		
		
		
	}
	
	public void PrintAll() {
		System.out.println(this.Personinfo());
		
	}
	
	

	static void  inputPerson() {
		System.out.println("++++++++++");
		System.out.println("이름 입력:");
		System.out.println("나이  입력:");
		System.out.println("+++++++++++");
	}
}
