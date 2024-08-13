package day06;
import java.util.Scanner;
import java.util.ArrayList;
public class Myshop implements Ishop {

	User[] user=new User[2];
	Product[] product=new Product[4];
	
	ArrayList<Product> cart=new ArrayList<Product>();
	Scanner sc=new Scanner(System.in);
	int selluser;
	String title;
	
	
	//매소드 정의
	public void productList() {
		System.out.println(title+": 상품목록-상품선택");
		System.out.println("=================");
		int i=0;
		
		for(Product p:product) {
			System.out.println("["+i+"]");
			p.printdetail();
			i++;
			
		}
		
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택  :");
		
		String sel=sc.next();
		System.out.println("##"+sel+"선택##");
		
		switch(sel) {
		case "h":start();break;
		case "c":checkout();break;
		default:
			int psel =Integer.parseInt(sel);
			cart.add(product[psel]);
			productList();
		}
		
	}
	
	
	//매소드 정의2
	
	public void checkout() {
		System.out.println(title+":체크아웃");
		System.out.println("=============");
		int total=0;
		int i=0;
		
		for(Product p:cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.Pname,p.price);
			total=total+p.price;
			
		}
		System.out.println("==============================");
		
		System.out.println("결제 방법:"+user[selluser].getPayType());
		
		System.out.println("합계"+total+"원 입니다");
		System.out.println("[p]이전,[q]결제 완료 ");
		System.out.println("선택 :");
		String sel=sc.next();
		switch(sel) {
		case"q":
			System.out.println("결제가 완료 되었습니다 .종료합니다");
			System.exit(0);
		case"p":productList();break;
		default:
			checkout();
		}
		
	}
	public static void main(String[] args) {
		
		Ishop shop=new Myshop();
		shop.setTitle("MYSHOP");
		shop.genuser();
		shop.genproduct();
		shop.start();
		
		
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void genuser() {
		User user1=new User("홍길동",Paytype.CARD);
		user[0]=user1;
		User user2=new User("블로거",Paytype.CASH);
		user[1]=user2;
	}

	@Override
	public void genproduct() {
		Cellphone cp=new Cellphone("갤럭시 노트5",220000,"SKT");
		product[0]=cp;
		Cellphone cp2=new Cellphone("아이폰5",2220000,"KT");
		product[1]=cp2;
		
		SmartTv tv1=new SmartTv("삼성스마트티비",220000,"500Hz");
		product[2]=tv1;
		SmartTv tv2=new SmartTv("LG 스마트티비",2220000,"320Hz");
		product[3]=tv2;
	}

	@Override
	public void start() {
		System.out.println(title+"메인 화면-계정 선택");
		System.out.println("=========================");
		int i=0;
		
		for(User u:user) {
			System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getPayType());
		}
		System.out.println("[x] 종료");
		System.out.println("선택:");
		String sel=sc.next();
		System.out.println("##"+sel+"선택##");
		
		switch(sel) {
		
		case "x":System.exit(0);break;
		default:
			selluser=Integer.parseInt(sel);
			productList();
		}
		
		
		
		
	}

}
