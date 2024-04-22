
import book.BookManager;
import java.util.Scanner;


public class AnimalBook {
    
	// static field
	private static BookManager manager = new BookManager();
	
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	int userVaule;
    	
    	while (true) {
    		System.out.println("[ 메뉴를 선택하세요 ]");
        	System.out.println("1. 정보 입력\n2. 정보 검색\n3. 정보 수정\n4. 정보 삭제\n5. 전체 정보\n6. 종료");
        	System.out.print("선택 ... ");
        	userVaule = input.nextInt();
    		
        	if (userVaule == 1) {
        		manager.inputData();
        	}
        	
        	if (userVaule == 2) {
        		manager.searchData();
        	}
        	
        	if (userVaule == 3) {
        		manager.updataData();
        	}
        	
        	if (userVaule == 4) {
        		manager.deleteData();
        	}
        	
        	if (userVaule == 5) {
        		manager.showBook();
        	}
        	
        	if (userVaule == 6) {
        		System.out.println("++ 프로그램을 종료합니다. ++");
        		input.close();
        		break;
        	}
        	
    	}
    }
}
