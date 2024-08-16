package day08;
import java.net.Socket;
import java.io.*;
import java.net.*;
import day07. ConsolChatServer;
public class ConsolchatClient implements Runnable {
	
	  Socket sock =null;
	
	//socket 클래스 
	//DAtain out 객체
	public ConsolchatClient() {
			
		
			
			
			try {
				sock =new Socket("10.10.108.163",50001);
				
				System.out.println("서버와 연결 성공");
				BufferedReader key =new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pout =new PrintWriter(sock.getOutputStream(),true);
				Thread tr =new Thread(this);
				tr.start();
				
				
				String msg ="";
				while((msg=key.readLine())!=null) {
					pout.println(msg);
				}
			
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		
		
		
		
		
		new  ConsolchatClient();
		
		
	
		
			
		

	}
	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String clienMsg="";
			while(true) {
				clienMsg =br.readLine();
				System.out.println("from Client>>"+clienMsg);
			}
		}catch(Exception e) {
			System.out.println("에외"+e.getMessage());
		}
		
	}

}
