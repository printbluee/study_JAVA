import book.BookManager;
import java.util.Scanner;

/*
 * [과제]
 * 1) Scanner 인스턴스 1개만 생성 - o
 * 
 * 2) AnimalBook class 
 *    [main method]
 *    2-1) if 문 -> switch문 으로 변경 - o
 *    2-2) 메뉴를 show() 메소드로 구현 - o
 *         book package 내 Menu class 추가 : show() 정의
 *    
 * 3) BookManager class
 *    3-1) updataData() : 이름이 있을 경우, 나이 입력 받기 - o
 *    3-2) inputData(), searchData(), upData(), deleteData() 메소드 내 - o
 *         중복된 코드를 메소드 구현 : search() - index 리턴 (int)
 *         중복된 코드 : for (int i=0; i<index; i++)
 *         
 * - 배열 100이 넘어갔을 때도 처리해야함
 * - 만약 i 가 99일때 infoStorage[j+1] 부분에서 에러가 뜸
 */

public class AnimalBook {

    // static field
    private static BookManager manager = new BookManager();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

    	boolean check = true;
        while(check) {
        	manager.show(); // 메뉴판
        	String userValue = input.next();
        	
        	switch(userValue) {
        	case "1":
        		manager.inputData(input);  	// 1. 정보 입력(저장)
        		break;
        	case "2": 
        		manager.searchData(input);	// 2. 정보 검색
        		break;	
        	case "3": 
        		manager.updataData(input); 	// 3. 정보 수정
        		break;
        	case "4": 
        		manager.deleteData(input); 	// 4. 정보 삭제
        		break;
        	case "5": 
        		manager.showBook();			// 5. 전체 정보
        		break;
        	case "6": 
        		System.out.println("++ 프로그램을 종료합니다. ++");
        		check = false;			    // 6. 종료
        		break;
        	}
        }
    }
}