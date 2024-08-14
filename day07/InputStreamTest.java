package day07;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamTest {

	public static void main(String[] args) {
		//데이터 소스
		
		//데이터 목적지 
		
		//1Byte
		//Crtl +c ctrl+D -1을 리턴한다
		try {
			int r=0;
			int count=0;
			
			while(true) {
				
				
				r= System.in.read();
				count++;
				
				if(r=='x'||r=='X') 
				
					break;
				
					System.out.println("r="+(char)r);
					}
				
			System.out.println("****************");
			System.out.println(count+"btye읽음");
			System.out.println("****************");
			System.in.close();
			
			
		}catch(IOException e) {
			e.getMessage();
		}

	}

}
