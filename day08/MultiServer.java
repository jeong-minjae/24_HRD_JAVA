package day08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	ServerSocket ser;
	
	public ArrayList<MultiServerRunnable> arrlist;
	MultiServerRunnable mr;
	Socket socket;
	public MultiServer() {
		
		try {
			ServerSocket ser =new ServerSocket(9999);
			arrlist =new ArrayList<MultiServerRunnable>();
			System.out.println("서버 대기중");
			
			while(true) {
				socket =ser.accept();
				System.out.println("연결 성공");
				mr =new MultiServerRunnable(socket);
				arrlist.add(mr);
				Thread thread = new Thread(mr);
				thread.start();
			}
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		new MultiServer();
	}





class MultiServerRunnable implements Runnable{
	Socket sock;
	DataInputStream dis;
	DataOutputStream dos;
	
	public MultiServerRunnable(Socket sock) {
		this.sock =sock;
		
	}
	
	public void BrodCasting(String msg) throws IOException{
		
		
		for(MultiServerRunnable mr: arrlist) {
			if(mr!=this) {
			System.out.println("Message"+msg.toString());
			mr.send(msg);
			}
		}
	}
	
	public void send(String msg) throws IOException{
		
		System.out.println("send{message"+msg);
		dos.writeUTF(msg);
		dos.flush();
	}

	@Override
	public void run() {
	//서버소켓 연결하고 상대방메세지 읽어와서 출력하기
		try {
			boolean flag =false;
		dis=new DataInputStream(sock.getInputStream());
		dos=new DataOutputStream(sock.getOutputStream());
		while(!flag) {
			String msg =dis.readUTF().toString();
			System.out.println("Message"+msg);
			BrodCasting(msg);
			
		}
		
		}catch(Exception e) {
			
		}
	}
}
	
}