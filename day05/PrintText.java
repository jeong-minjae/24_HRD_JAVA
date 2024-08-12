package day05;

public class PrintText implements Printable {

	public static void main(String[] args) {
		
		PrintText pt =new PrintText();
		
		pt.printme();

	}

	@Override
	public void printme() {
		System.out.println("텍스트 파일 출력합니다");
		
	}

}
