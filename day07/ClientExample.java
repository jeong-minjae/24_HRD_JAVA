package day07;
import java.net.*;

import java.io.*;
public class ClientExample   {
	static DataInputStream dis =null;
	static DataOutputStream dos=null;
	Socket socket;
	public ClientExample()throws IOException {
		
		socket =new Socket("localhost",5555);
		System.out.println("서버와 연결성공");
		
		//System.out.println("서버와 연결끊음");
		
		dis =new DataInputStream(socket.getInputStream());
		//String messege ="반갑습니다";
		String mes =dis.readUTF();
		System.out.println("서버>>>"+mes);
		
		socket.close();
		
	}

	public static void main(String[] args) throws IOException {
		new ClientExample();

	}

}
