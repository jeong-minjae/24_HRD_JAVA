package day04;
import java.util.Scanner;
import day03.Person;
import java.util.ArrayList;
public class JobApp {
	
	static Person p1;
	static ArrayList<Person> arraylist=new ArrayList<Person>();
	
	public void showMenu() {
		System.out.println("************0.8 1.1*************");
		System.out.println("1구직등록");
		System.out.println("2.구인등록");
		System.out.println("3.구직자 정보 등록");
		System.out.println("4구인회사 정보출력");
		System.out.println("5.종료");
		System.out.println("********************************");
		System.out.println("메뉴번호를 입력하세여");
		System.out.println("*********************************");
	}//showmenu
	
	public  void inputPerson() {
		
		
		Scanner sc=new Scanner(System.in);
		p1=new Person();
		System.out.println("구직등록 스타트");
		System.out.println("이름입력");
		String nm=sc.next();
		p1.name=nm;
		System.out.println("나이 입력=>");
		int a=sc.nextInt();
		p1.age=a;
		
		System.out.println("--성별---");
		System.out.println("1.남자 2.여자");
		System.out.println("---------");
		System.out.println(" 성별 입력");
		int s=sc.nextInt();
		if(s==1) {
			p1.gender='M';
		}else if(s==2){
			p1.gender='F';
		}else {
			System.out.println("지원되지 않는 메뉴번호입니다");
		}
			System.out.println("전화 번호입력");
			String t=sc.next();
			p1.tel=t;
			arraylist = new ArrayList<Person>();
			arraylist.add(p1);
		
		
		
	}
	
	
	
	//구직자 정보 출력 메소드
	void showInfo() {
		for(Person p:arraylist) {
		p.getinfo();
		}
	}

	public static void main(String[] args) {
		//person 객체생성
		//필드 생성자 메소드
		
	Scanner sc=new Scanner(System.in);
		JobApp jb =new JobApp();
		while(true) {
			jb.showMenu();
			int no=sc.nextInt();
			if(no==5) {
				System.exit(0);
			}else if(no==1) {
				jb.inputPerson();
			}else if(no==3) {
				jb.showInfo();
			}
		}
		
		

	}

}





