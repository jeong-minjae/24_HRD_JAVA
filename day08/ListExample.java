package day08;
import java.util.List;
import java.util.ArrayList;

class Board{
	private String title;	
	private String content;
	
	public Board(String title ,String content) {
		this.title=title;
		this.content=content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	
	
}

class BoardDao{
	Board board;
	List<Board> list =new ArrayList();
	public BoardDao(Board board) {
		this.board =board;
	}
	List<Board> getBoardList(){
		List<Board>list =new ArrayList<Board>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list;
		}
	
	
	
	
}
public class ListExample {

	public static void main(String[] args) {
		BoardDao dao=new BoardDao(null);
		
		
		List<Board> list=dao.getBoardList();
		for(Board board:list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}

	}

}
