package day10;
import java.sql.*;
import java.io.*;
import java.util.*;
public class DataModel {
//데이터 베이스 연결
// 데이터 입출력 담당 매소드 구현
	
	
	
	Connection con=null;
	PreparedStatement pst =null;
	ResultSet rs =null;
	ConnectDB cdb =null;
	Board board =null;
	Scanner scan =null;
	BoardExample2 bm2=null;
	public DataModel() {
		
		cdb = new ConnectDB();
		con =cdb.getCon();
		if(con!=null) {
			System.out.println("연결 성공");
		}else {
			System.out.println("연결 실패");
		}
		scan =new Scanner(System.in);
		
	}
	
	//데이터 추가 메소드  insertData (intsert into~)
	public void  insertData(Board board) throws SQLException {
		int num=0;
		this.board=board;
		String sql ="insert into boards( btitle,bcontent,bwriter,bdate) values(?,?,?,now())";
		pst=con.prepareStatement(sql);
		pst.setString(1, board.getBtitle());
		pst.setString(2, board.getBcontent());
		pst.setString(3, board.getBwriter());
		num=pst.executeUpdate();
		if(num>0)System.out.println("저장성공");
		else System.out.println("저장 실패");
		
	}
	
	
	public void create() throws SQLException {
		Board board =new Board();
		bm2 =new BoardExample2();
		System.out.println("[새 게시물 입력]");
		System.out.println("제목:");
		board.setBtitle(scan.nextLine());
		System.out.println("내용:");
		board.setBcontent(scan.nextLine());
		System.out.println("작성자:");
		board.setBwriter(scan.nextLine());
		//////////////////////////////
		insertData(board);
		//////////////////////////////
		list();
		
		/////////////////////////////
		System.out.println("보조메뉴1.OK|2.cancle");
		System.out.println("메뉴선택");
		String menuno = scan.nextLine();
		if(menuno.equals("1")) {
			try {
				String sql ="insert into boards (btitle,bcontent,bwriter,bdate)"+" values(?,?,?,now())";
				PreparedStatement pstmt =con.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				list();
			}catch(Exception e) {
				e.printStackTrace();
				
				
			}
		}
		list();
		
	}
	public void list() throws SQLException{
		bm2 =new BoardExample2();
		System.out.println("[게시물목록]");
		System.out.println("=============================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","winter","date","title");
		System.out.println("=============================================");
	String sql =" "+"SELECT bno, btitle,bcontent,bwriter,bdate from boards order by bno desc";
	 pst =con.prepareStatement(sql);
	 rs =pst.executeQuery();
	while(rs.next()) {
		Board board =new Board();
		board.setBno(rs.getInt("bno"));
		board.setBtitle(rs.getString("btitle"));
		board.setBcontent(rs.getString("bcontent"));
		board.setBwriter(rs.getString("bwriter"));
		board.setBdate(rs.getDate("bdate"));
		
		
		
		
		System.out.println(board.getBno());
		System.out.println(board.getBtitle());
		System.out.println(board.getBcontent());
		System.out.println(board.getBwriter());
		bm2.mainmenu();
	}

	}
	//데이터 검색 list
	
public void list(String name) throws SQLException{
		
		System.out.println("[게시물목록]");
		System.out.println("=============================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","winter","date","title");
		System.out.println("=============================================");
	String sql =" "+"SELECT bno, btitle,bcontent,bwriter,bdate from boards where bwriter=?";
	
	 pst =con.prepareStatement(sql);
	 pst.setString(1, name);
	 rs =pst.executeQuery();
	while(rs.next()) {
		Board board =new Board();
		board.setBno(rs.getInt("bno"));
		board.setBtitle(rs.getString("btitle"));
		board.setBcontent(rs.getString("bcontent"));
		board.setBwriter(rs.getString("bwriter"));
		board.setBdate(rs.getDate("bdate"));
		
		
		
		
		System.out.println(board.getBno());
		System.out.println(board.getBtitle());
		System.out.println(board.getBcontent());
		System.out.println(board.getBwriter());
	}

	
	
	
	
	}
	

public void read(int bno) throws SQLException {
	System.out.println("[게시물 읽기]");
	String sql =" "+"SELECT bno, btitle,bcontent,bwriter,bdate from boards where bno =?";
	pst=con.prepareStatement(sql);
	
	pst.setInt(1, bno);
	rs=pst.executeQuery();
	
	
	while(rs.next()) {
		Board board =new Board();
		board.setBno(rs.getInt("bno"));
		board.setBtitle(rs.getString("btitle"));
		board.setBcontent(rs.getString("bcontent"));
		board.setBwriter(rs.getString("bwriter"));
		board.setBdate(rs.getDate("bdate"));
		System.out.println("#####################");
		
		
		System.out.println("번호: "+board.getBno());
		System.out.println("제목:"+board.getBtitle());
		System.out.println("내용:"+board.getBcontent());
		System.out.println("작성자:"+board.getBwriter());
		System.out.println("날짜:"+board.getBdate());
		
		
		//보조 메뉴 출력
		System.out.println("------------------");
		System.out.println("1.update|2.delete|3.list");
		System.out.println("보조 메뉴선택");
		String menuno =scan.nextLine();
		System.out.println();
		
		if(menuno.equals("1")) {
			update(board);
		}else if(menuno.equals("2")) {
			delete(board);
		}else if (menuno.equals("3")) {
			list();
		}
	}
}

public void read() throws SQLException {
	System.out.println("[게시물 읽기]");
	System.out.println("bno:");
	int bno =scan.nextInt();
	String sql =" "+"SELECT bno, btitle,bcontent,bwriter,bdate from boards where bno =?";
	pst=con.prepareStatement(sql);
	
	pst.setInt(1, bno);
	rs=pst.executeQuery();
	
	
	while(rs.next()) {
		Board board =new Board();
		board.setBno(rs.getInt("bno"));
		board.setBtitle(rs.getString("btitle"));
		board.setBcontent(rs.getString("bcontent"));
		board.setBwriter(rs.getString("bwriter"));
		board.setBdate(rs.getDate("bdate"));
		System.out.println("#####################");
		
		
		System.out.println("번호: "+board.getBno());
		System.out.println("제목:"+board.getBtitle());
		System.out.println("내용:"+board.getBcontent());
		System.out.println("작성자:"+board.getBwriter());
		System.out.println("날짜:"+board.getBdate());
		
		
		//보조 메뉴 출력
		System.out.println("------------------");
		System.out.println("1.update|2.delete|3.list");
		System.out.println("보조 메뉴선택");
		String menuno =scan.next();
		System.out.println();
		
		if(menuno.equals("1")) {
			update(board);
		}else if(menuno.equals("2")) {
			delete(board);
		}else if (menuno.equals("3")) {
			list();
		}
	}
}



















public void update(Board board) throws SQLException {
	//수정 내용 입력받기 
	System.out.println("수정 내용 입력");
	System.out.print("제목:");
	board.setBtitle(scan.next());
	System.out.print("내용 :");
	
	board.setBcontent(scan.next());
	System.out.print("작성자:");
	board.setBwriter(scan.next());
	
	//보조메뉴 출력
	
	System.out.println("------------------");
	System.out.println("1.OK|2.cancle");
	System.out.print("보조 메뉴선택");
	String menuno =scan.next();
	if(menuno.equals("1")) {
		//개시물 정보수정
		try {
			String sql = "update boards set btitle =?,bcontent=?,bwriter=? where bno =?";
			pst =con.prepareStatement(sql);
			pst.setString(1, board.getBtitle());
			pst.setString(2, board.getBcontent());
			pst.setString(3, board.getBwriter());
			pst.setInt(4, board.getBno());
			
			pst.executeUpdate();
			list();
			pst.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
		
		list();
	}
	
public void delete(Board board) throws SQLException {
	try {
		String sql="delete from boards where bno=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setInt(1,board.getBno());
		pstmt.executeUpdate();
		pstmt.close();
	}catch(Exception e) {
		e.printStackTrace();
		
	}
		list();
	}


	public static void main(String[] args) throws SQLException {
			DataModel dm =new DataModel();
			
				//dm.read(1);
				//dm.create();
				
		
				
			

	}
	

}
