package day07;
import java.io.*;
//데이터 소스 파일
// 데이터 목적지 파일 콘솔
//FileReadeer FileWrite OutputStreamWriter
//파일복사 구현하기

public class FileCopyAndConsoleOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="cpy.txt";
		
		try {
			FileReader fr=new FileReader("FileOut.java");
			BufferedReader br =new BufferedReader(fr);
			FileWriter fw =new FileWriter(filename);
			BufferedWriter bw =new BufferedWriter(fw);
			OutputStreamWriter osw=new OutputStreamWriter(System.out);
			int n=0;
			while((n=br.read())!=-1) {
				
				bw.write(n);
				bw.flush();
				osw.write(n);
				osw.flush();
				
			}
			br.close();
			bw.close();
			osw.close();
		
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
