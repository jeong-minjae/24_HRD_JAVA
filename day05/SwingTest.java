package day05;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SwingTest extends JFrame{
	
	JButton okbtn;
	
	public SwingTest() {
		super("첫번째 스윙 연습");
		//setTitle("타이틀");
		okbtn =new JButton("OK");
		MyListener my=new MyListener();
		add(okbtn);
		okbtn.addActionListener(my);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	
	//내부클래스(inner class 로 이벤트 처리자 구현하기
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String result =e.getActionCommand();
			if(result.equals("OK")) {
				System.out.println("OK 버튼이 클릭됨");
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new SwingTest();

	}

}
