package day09;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 */

public class PersonSelect {

	public static void main(String[] args) {
		Connection con = null;
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
			//3. sql실행하기위한 Statement PreparedStatement
			
			String sql2 = "select * from person ";
			PreparedStatement st =con.prepareStatement(sql2);
			
			 st2 =con.createStatement();
			 
			 
			//이름이 홍길동과 같은사람의 모든열의 정보를 검색해서 출력하기
			//String sql="INSERT INTO	person VALUES('정민재','0105445455','sdadas@dju.kr',30)";
			
//			st.setString(1, "alswo5265"); //1로 시작
//			st.setString(2, "정민재");
//			st.setString(3, "1234");
//			st.setInt(4, 20);
//			st.setString(5, "wjdalswo57@naver.com");
			//4.데이터 추가 명령어 전송하기 
			
			
			
			 result = st.executeQuery(sql2);
			
			String name ="";
			String email ="";
			String phone ="";
			int age =0;
			Person person =null;
			ArrayList<Person> arlist =new ArrayList<Person>();
			while(result.next()) {
				name =result.getString("name");
				phone =result.getString("phone");
				email=result.getString("email");
				age =result.getInt("age");
				person =new Person(name,phone,email,age);
				arlist.add(person);
				
			}
			for(Person p:arlist) {
				System.out.println("이름:"+p.getName());
				System.out.println("전화번호:"+p.getPhone());
				System.out.println("이메일:"+p.getEmail());
				System.out.println("나이:"+p.getAge());
				
				
			}
			
			
			
			
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}finally {
			try {
				con.close();
				result.close();
				st2.close();
				System.out.println("연결끊기");
			}catch(SQLException e1) {
				
			}
		}

	}

}
