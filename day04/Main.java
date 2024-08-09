package day04;
import java.util.ArrayList;
public class Main {
	
	//클래스 구성요소
	//필드:객체의 데이터를 저장하는 역할
	
	//생성자 : 기본생성자 ,인자 생성자 
	
	
	//메소드:

	public static void main(String[] args) {
		
		House house1 = new House("염희균",3,"대전동구용운동");    //기본 생성자 만들어주기 인자생성자를 만들면

		
		house1.showOwner(house1.ownername);
		System.out.println("방의 갯수"+ house1.roomnum);
		System.out.println("집의 정보"+house1.showinfo());
		house1.showinfo2();
		
		
		ArrayList<House> arrlist=new ArrayList<House>();
		arrlist.add(house1);
		arrlist.add(new House("강길동",2,"대전 서구 갈마동"));
		arrlist.add(new House("이자바",4,"대전 중구 대흥동"));
		
		for(House house :arrlist) {
			house.showinfo2();
		}
		
	}

}








//집 클래스 모델링 

 
class House {
	String ownername;
	String address;
	int roomnum;
	
public House() {
	
}


public House(String ownername,int roomnum,String address) {
	this.ownername=ownername;
	this.address=address;
	this.roomnum=roomnum;
}

 void showOwner(String ownername) {
	System.out.println("주인이름은"+ownername+" 입니다");
}


int roomnum(int roomnum) {
	return roomnum;
}

String showinfo() {
	String result="집 주인이름은"+ownername+ "\n 방의 갯수"+roomnum+"\n 집 주소"+address; 
	return  result;
}


//show

void showinfo2() {
	
	System.out.println("집 주인이름은"+ownername+ "\n 방의 갯수"+roomnum+"\n 집 주소"+address);
}
	
}	
	


















