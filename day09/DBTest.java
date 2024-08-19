package day09;
import java.io.*;
import java.sql.*;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 */

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		try{
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.데이터 베이스 로딩
			
			String ulr ="jdbc:mysql://localhost:3306/contacts";
			String id ="root";
			String pwd ="1234";
			con = DriverManager.getConnection(ulr,id,pwd);
			System.out.println("DB 연결 성공");
			//3. sql실행하기위한 Statement PreparedStatement
			
			String sql2 = "insert into users(userid,username,userpassword,userage,useremail)"
					+"values(?,?,?,?,?)";
					
			//String sql="INSERT INTO	person VALUES('정민재','0105445455','sdadas@dju.kr',30)";
			PreparedStatement st =con.prepareStatement(sql2);
			st.setString(1, "alswo5265"); //1로 시작
			st.setString(2, "정민재");
			st.setString(3, "1234");
			st.setInt(4, 20);
			st.setString(5, "wjdalswo57@naverc.com");
			//4.데이터 추가 명령어 전송하기 
			int result = st.executeUpdate();
			if(result >0) {
				System.out.println("데이터 저장 성공");
			}else {
				System.out.println("데이터 저장실패");
			}
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}finally {
			try {
				con.close();
				System.out.println("연결끊기");
			}catch(SQLException e1) {
				
			}
		}

	}

}
