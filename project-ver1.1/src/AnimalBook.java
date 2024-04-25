
import book.BookManager;

/*
 * [과제] - 구현 완료 !
 * 1) Scanner 인스턴스 1개만 생성 - o
 * 
 * 2) AnimalBook class 
 *    main method 내 if 문 -> switch문 으로 변경 - o
 */

public class AnimalBook {
    
	// static field
	private static BookManager manager = new BookManager();
	
    public static void main(String[] args) {

    	String userVaule = "";
    	
    	menu:
    	while (true) {
    		System.out.print("정보 입력할까요? (Y/N) ... ");
    		userVaule = BookManager.input.next().toUpperCase();
			
    		switch (userVaule) {
    		case "Y": case "Yes":
    			manager.inputData();
    			break;
    		case "N": case "No":
    			System.out.println("정보 입력을 종료합니니다.");
    			manager.showBook();
    			break menu;
    		default:
    			System.err.println("Y/N 둘 중 하나를 입력하세요.");
    		} 
    	}
    	BookManager.input.close();
    }
}