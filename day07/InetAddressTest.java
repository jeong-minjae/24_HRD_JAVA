package day07;
import java.io.IOException;
import java.net.InetAddress;
public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local =InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP주소"+local);
			
			InetAddress[]locals =InetAddress.getAllByName("www.naver.com");
			for(InetAddress in:locals) {
				System.out.println("www.naver.com IP주소"+in.getHostAddress());
			}
		}catch(IOException e) {
			
		}
	}

}
