
import book.BookManager;
import java.util.Scanner;

public class AnimalBook {
    
	// static field
	private static BookManager manager = new BookManager();
	private static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {

    	String userVaule = "";
    	
    	while (true) {
    		System.out.print("정보 입력할까요? (Y/N) ... ");
    		userVaule = input.next();
			
    		if (userVaule.equalsIgnoreCase("y") || userVaule.equalsIgnoreCase("yes")) {
        		manager.inputData();
    		} else if (userVaule.equalsIgnoreCase("n") || userVaule.equalsIgnoreCase("no")) {
    			System.out.println("정보 입력을 종료합니니다.");
            	manager.showBook();
            	input.close();
            	break;
    		}
    	}
    }
}
