package day09;
import java.io.*;
import java.sql.*;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 */

public class UserSelectExample {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet result =null;
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
			
			String sql2 = "select * from users where userid =?";
					
			//String sql="INSERT INTO	person VALUES('정민재','0105445455','sdadas@dju.kr',30)";
			PreparedStatement st =con.prepareStatement(sql2);
			st.setString(1, "alswo5265"); //1로 시작
			
			
			//4.데이터 추가 명령어 전송하기 
			 result = st.executeQuery();
			if(result.next()) {
				System.out.println("데이터 조회 성공");
				String name =result.getString("username");
				int age =result.getInt("userage");
				System.out.println("이름:"+name);
				System.out.println("나이: "+age);
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
