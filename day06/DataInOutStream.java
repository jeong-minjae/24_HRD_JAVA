package day06;
import java.io.*;



public class DataInOutStream {
	
	static DataOutputStream dos =null;
	static DataInputStream dis=null;
	 public static void main(String[] args) {
		
		
		try {
			dos =new DataOutputStream(System.out);
			dos.write(10);
			dos.writeDouble(156.5);
			dos.writeBoolean(true);
			dos.writeChar('가');
			dos.writeUTF("문자열 입력");
			dos.flush();
			System.out.println("정수값:"+dis.read());
			System.out.println("실수값"+dis.readDouble());
			System.out.println("논리값"+dis.readBoolean());
			System.out.println("문자값"+dis.readUTF());
			dis.close();
			dos.close();
		}catch(Exception e) {
			e.getMessage();
			}
	}

}
