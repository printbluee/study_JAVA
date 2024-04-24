import book.BookManager;
import java.util.Scanner;

public class AnimalBook {

    // static field
    private static BookManager manager = new BookManager();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
        	System.out.println("[ 메뉴를 선택하세요 ]");
            System.out.println("1. 정보 입력\n2. 정보 검색\n3. 정보 수정\n4. 정보 삭제\n5. 전체 정보\n6. 종료");
            System.out.print("선택 ... ");
            int userValue = input.nextInt();
            
            if (userValue == 1) {
            	// 1. 정보 입력
            	manager.inputData();
            } else if (userValue == 2) {
            	// 2. 정보 검색
            	manager.searchData();
            } else if (userValue == 3) {
            	// 3. 정보 수정
            	manager.updataData();
            } else if (userValue == 4) {
            	// 4. 정보 삭제
            	manager.deleteData();
            } else if (userValue == 5) {
            	// 5. 전체 정보
            	manager.showBook();
            } else if (userValue == 6){
            	// 6. 종료
            	System.out.println("++ 프로그램을 종료합니다. ++");
            	input.close();
            	break;
            } else {
            	System.out.println("잘못된 선택입니다. 다시 선택해주세요.\n");
            }
        }
        
    }
}