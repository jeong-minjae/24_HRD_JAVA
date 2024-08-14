package day07;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class ConsolChatServer implements Runnable{
	
	
	
	
	private static ServerSocket serverSocket=null;
	
	
	static Socket sock1=null;
	
	public ConsolChatServer() throws Exception {
		serverSocket =new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		sock1 =serverSocket.accept();
		System.out.println("클라이언트 접속 성공");
		
		BufferedReader key =new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pout =new PrintWriter(sock1.getOutputStream(),true);
		Thread tr =new Thread(this);
		tr.start();
		String msg ="";
		while((msg=key.readLine())!=null) {
			pout.println(msg);
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			new ConsolChatServer();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

	

		@Override
		public void run() {
			try {
				InputStream is = sock1.getInputStream();
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