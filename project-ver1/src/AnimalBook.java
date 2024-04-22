
import book.BookManager;
import java.util.Scanner;


public class AnimalBook {
    
	// static field
	private static BookManager manager = new BookManager();
	
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	String userVaule = "";
    	
    	while (true) {
    		System.out.print("정보 입력할까요? (Y/N) ... ");
    		userVaule = input.next();
    		
    		if (userVaule.equalsIgnoreCase("y") || userVaule.equalsIgnoreCase("yes")) {
    			System.out.println("<< 정보를 입력하세요 >>");
        		manager.inputData();
    		} else if (userVaule.equalsIgnoreCase("n") || userVaule.equalsIgnoreCase("no")) {
    			System.out.println("정보 입력을 종료합니니다.\n");
    			System.out.println("<< 저장 목록 >>");
            	manager.showBook();
            	input.close();
            	break;
    		}
    	}
    }
}
