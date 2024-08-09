package day04;
import java.util.ArrayList;
/*상속을 이용하여 다음 요구사항 (중복코드 제거)을 해결하시오 
 * 게임 캐릭터의 초기 작업인 마법사 클래스를 다음과 같이 설계했다고 가정 
 * wizard 클래스가 novice클래스의 모든 필드와 메소드를 가지고있고 
 * 추가로 마력 필드와 mp와 불 공격 메소드 fireball()이 더해져있음
 */

class Novice{
	String name;
	int hp;
	void punch() {
		System.out.printf("%s(HP:%d)의 펀치! \n",name,hp);
	}
}

class Wizard extends Novice{
	
	int mp;
	void fireball() {
		System.out.printf("%s(MP:%d)의 불공격! \n",name,mp);
	}
}
class Knight extends Novice{
	int stamina;
	
	 void slash() { 
		 System.out.printf("%s(stamina:%d)의 슬래시공격\n",name,stamina);
	 }
}

public class GameCharacterTest {

	public static void main(String[] args) {
		
		Wizard wizard =new Wizard();
		wizard.name="배틀메이지";
		wizard.hp=130000;
		wizard.mp=60000;
		
		Knight knight=new Knight();
		knight.name="소울마스터";
		knight.hp=130000;
		knight.stamina=50000;
		
		wizard.fireball();
		knight.slash();
		
		wizard.punch();
		knight.punch();
		
		ArrayList<Novice> gamelist=new ArrayList<Novice>();//모으기
		gamelist.add(wizard);
		gamelist.add(knight);
		
		
		
		for(Novice n:gamelist) {
			if(n instanceof Wizard) {//
				((Wizard) n).fireball();
			} if(n instanceof Knight) {
				((Knight) n).slash();
			}
		}

	}

}
