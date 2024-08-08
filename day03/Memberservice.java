package day03;

public class Memberservice {

	public boolean login(String id,String pw) {
		boolean result;
		if(id.equals("hong")&& pw.equals("12345")) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되셨습니다");
	}
	
}
