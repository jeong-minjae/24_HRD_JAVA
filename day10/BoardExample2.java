package day10;
import java.sql.SQLException;
import java.util.Scanner;
public class BoardExample2 {

	
	private Scanner sc =new Scanner(System.in);
	 DataModel dm=null;
	public BoardExample2() {
		dm= new DataModel();
		}
	
	
	public void mainmenu() throws SQLException {
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("메인메뉴 1.create|2.Read|3.clear|4.Exit");
		System.out.print("메뉴선택");
		String menuno =sc.nextLine();
		System.out.println();
		
		switch(menuno) {
		case"1" : dm.create();break;
		case"2": dm.read();break;
		case"3" : clear();break;
		case"4" : exit();break;
		}
		
		}
	
	
	
	
	
	public void create() throws SQLException {
		System.out.println("create 실행됨");
		dm.list();
	}
	
public void read() {
		System.out.println("read 메소드 실헹됨");
	}

public void clear() {
	System.out.println("clear 메소드 실행됨");
	
}

public void exit() {
	System.exit(0);
}

public static void main(String[] args) throws SQLException {
	
	BoardExample2 bm2 =new BoardExample2();
	bm2.mainmenu();
}
}

