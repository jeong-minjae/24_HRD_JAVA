package day05;

public class Teacher extends Person  {

	//id 과목
	private String Subject;
	private String id;
	
	
	public Teacher(String id,String subject,String name,int age) {
		super(name,age);
		this.id=id;
		this.Subject=subject;
		
	}


	public String getSubject() {
		return Subject;
	}


	public void setSubject(String subject) {
		Subject = subject;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String Personinfo() {
		String info= super.Personinfo();
		info += "선생님ID:"+id+"과목 "+Subject;
		return info;
	}
	
	
	
	
	
}
