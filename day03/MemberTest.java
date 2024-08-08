package day03;
import java.util.ArrayList;
public class MemberTest {

	public static void main(String[] args) {
		
		Member user1 =new Member("홍길동","hong");
		
		Memberservice memberservice=new Memberservice();
			ArrayList<Member> memlist=new ArrayList<Member>();
			memlist.add(user1);
			memlist.add(new Member("강길동","kang"));
			for(Member m:memlist) {
				System.out.println(m.name+"\n"+m.id);
			}
			
		boolean result=memberservice.login("hong", "12345");
		
		
		if(result) {
			System.out.println("로그인 되었습니다");
			memberservice.logout("hong");
		}else {
			System.out.println("로그인 실패");
			
		}
		
	
		
	}

}
