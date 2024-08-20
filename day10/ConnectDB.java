package day10;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
public class ConnectDB {

 	static  Connection con = null;
 	
 	public ConnectDB() {
 		
 		
 		
 		ResultSet result =null;
 		Statement st2 =null;
 		
 		try{
 			//1.드라이버 로딩
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			//2.데이터 베이스 로딩
 			
 			String ulr ="jdbc:mysql://localhost:3306/contacts";
 			String id ="root";
 			String pwd ="1234";
 			con = DriverManager.getConnection(ulr,id,pwd);
 			System.out.println("DB 연결 성공");
 		}catch(Exception e) {
 			
 		}//생성자
 		
 		
 	}
 	
 	Connection getCon() {
 		return con;
 	}
 	
	public static void main(String[] args) {
		
			

	}

}
