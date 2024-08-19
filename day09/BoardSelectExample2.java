package day09;
import java.io.*;
import java.sql.*;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 */

public class BoardSelectExample2 {

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
			
			String sql2 = "select * from boards where bwriter = ?";
					
			//String sql="INSERT INTO	person VALUES('정민재','0105445455','sdadas@dju.kr',30)";
			PreparedStatement st =con.prepareStatement(sql2);
			st.setString(1, "winter"); //1로 시작
			
			//4.데이터 추가 명령어 전송하기 
		 ResultSet rs = st.executeQuery();
			while( rs.next()) {
				System.out.println("데이터 조회 성공");
				int bno = rs.getInt("bno");
				String btitle =rs.getString("btitle");
				String bcontent =rs.getString("bcontent");
				String bwriter =rs.getString("bwriter");
				String d =rs.getDate("bdate").toString();
				String filename=rs.getString("bfilename");
				Blob blob =rs.getBlob("bfiledata");
				InputStream is =blob.getBinaryStream();
				OutputStream os =new FileOutputStream("C:\\\\Users\\\\COMPUTER\\\\eclipse-workspace\\\\javaOOP\\\\src\\\\day09\\\\snow.jpg");
				is.transferTo(os);
				System.out.println("번호:"+bno);
				System.out.println("제목:"+btitle);
				System.out.println("내용"+bcontent);
				System.out.println("작성자:"+bwriter);
				System.out.println("작성일:"+d);
				System.out.println("파일이름"+filename);
				//System.out.println("파일정보"+bname);
			
				os.flush();
				os.close();
				is.close();
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
