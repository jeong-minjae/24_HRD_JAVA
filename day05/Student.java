package day05;

public class Student extends Person {

	//학급 변수 cName 추가
	private String id;
	private String cName;
	//아이디 학급 변수 
	
	//생성자
	public Student(String id,String cName,String name,int age){
		super(name,age);
		this.cName=cName;
		
		this.id=id;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String Personinfo() {
		String info = super.Personinfo();
		info += "ID:"+id+"\n 학급이름:"+cName;
		return info;
	}
	
	//getter setter
	
	//메소드 오버라이딩
	
}

