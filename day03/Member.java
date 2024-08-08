package day03;

public class Member {

	String name="정민재";
	String id="alswo5265";
	String pw="alswo123";
	int age;
	
	
	
	public Member() {
		
	}
	
	public Member(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	
	void Membership() {
		System.out.println("이름"+name);
		System.out.println("아이디"+id);
		System.out.println("패스워드"+pw);
		System.out.println("나이"+age);
		
	}
}
