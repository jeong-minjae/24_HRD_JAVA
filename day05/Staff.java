package day05;

public class Staff extends Person {

	//id
	private String id;
	private String dept;
	
	
	public Staff(String id ,String dept,String name,int age) {
		super(name ,age);
		this.dept=dept;
		this.id=id;
	}
	
	public String getDept() {
		return dept;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//private String dept 담당부서
	
	@Override
	public String Personinfo() {
	String info=super.Personinfo();
	info += "사원 ID:"+id+"사원관리"+dept;
	return info;
	}
	
}
