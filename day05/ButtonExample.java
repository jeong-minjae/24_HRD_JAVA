package day05;
import java.awt.*;


class Button{
	//정적 중첩 인터페이스
	
	
	static interface ClickListener{
		void onClick();
	}
	
	
	private ClickListener clistener;
	public void setClickListener(ClickListener cllistener) {
		this.clistener=cllistener;
	}
	
	public void onClick() {
		clistener.onClick();
	}
	
	
}



public class ButtonExample {

	public static void main(String[] args) {
		
		
		Button okbtn =new Button();
		
		class oklistener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다");
				
			}
			
		}
		
			okbtn.setClickListener(new oklistener());
			okbtn.onClick();
		
		
	}

}
