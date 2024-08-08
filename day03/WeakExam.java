package day03;

import java.util.Calendar;

public class WeakExam {

	public static void main(String[] args) {
		
		//열거형은 참조형
		
		
		
		Weak today =null;  //기본 null
		
		 Calendar cal= Calendar.getInstance();
		 
		 int week= cal.get(Calendar.DAY_OF_WEEK);
		 
		 switch(week) {
		 case 1:
			 today =Weak.SUNDAY;
			 break;
			 
		 case 2:
			 today =Weak.MONDAY;
			 break;
			 
		 case 3:
			 today =Weak.THUSDAY;
			 break;
			 
		 case 4:
			 today =Weak.WENDSDAY;
			 break;
			 
		 case 5:
			 today =Weak.THURSDAY;
			 break;
			 
		 case 6:
			 today =Weak.FRIDAY;
			 break;
			 
		 case 7:
			 today =Weak.SATURDAY;
			 break;
			 
			 default:
		 }
		if(today==Weak.FRIDAY) {
			System.out.println("올림픽 시청하기");
		}else {
			System.out.println("자바 공부하기");
		}
			

	}

}
