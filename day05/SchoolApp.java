package day05;
import java.util.ArrayList;
public class SchoolApp {
	
	
	public static void main(String[] args) {
		
		
		 Person person;	
	
	ArrayList<Person> personlist =new ArrayList<Person>();
		
		
		person =new Student("202401","자바","홍길동",20);
		personlist.add(person);
		personlist.add(new Staff("201010","HRD 사업단","김사업",20));
		personlist.add(new Teacher("199901","네트워크","이교사",20));
		
		//person.inputPerson();
		
		for(Person p:personlist) {
		if(p instanceof Student) {//강제 타입변환
			System.out.println(((Student) p).getId());
		}else if(p instanceof Teacher ) {
			System.out.println(((Teacher) p).getId());
		}else if(p instanceof Staff) {
			System.out.println(((Staff) p).getId());
		}
			//p.PrintAll();
		}

	}

}
