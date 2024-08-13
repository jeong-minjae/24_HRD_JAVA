package day06;

import java.io.*;
public class FileWrite {

	static FileWriter fw=null ;
	static InputStreamReader isr =null;
	static BufferedInputStream dis=null;
	static DataOutputStream dos=null;
	OutputStreamWriter osw =null;
	public static void main(String[] args) {
	try {	
		
		//키보드로 부터 문자데이터를 읽어 와서 콘솔 출력하고 파일로도 출력하기
		InputStream is =System.in;
		dis=new BufferedInputStream(is);
		BufferedOutputStream bos =new BufferedOutputStream(System.out);
		dos =new DataOutputStream(System.out);
		int data=0;
	while((data=dis.read())!=-1) {
		bos.write(data);
		bos.flush();
	}
		//System.out.println("메세지"+messege);
		System.out.println(dos=new DataOutputStream(System.out));
		
	//	fw =new FileWriter("file.txt");
	//	fw =new FileWriter("test.txt");
		fw.write("java");
	}catch(IOException e) {
		
		System.out.println(e.getMessage());
		System.out.println("파일이 존재하지않습니다");
	}finally {
		try {
			fw.close();
			dis.close();
		}catch(IOException e) {
			
		}
		
	}
		

	}

}
