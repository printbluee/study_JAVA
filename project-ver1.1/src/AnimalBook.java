
import book.BookManager;
import java.util.Scanner;

/*
 * [과제]
 * 1) Scanner 인스턴스 1개만 생성 - o
 * 
 * 2) AnimalBook class 
 *    main method 내 if 문 -> switch문 으로 변경 - o
 */

public class AnimalBook {
    
	// static field
	private static BookManager manager = new BookManager();
	private static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {

    	String userVaule = "";
    	boolean check = true;
    	while (check) {
    		System.out.print("정보 입력할까요? (Y/N) ... ");
    		userVaule = input.next();
			
    		switch (userVaule) {
    		case "y": case "Y": case "yes": case "Yes": case "YES": 
    			manager.inputData(input);
    			break;
    		case "n": case "N": case "no": case "No": case "NO":
    			System.out.println("정보 입력을 종료합니니다.");
    			manager.showBook();
    			check = false;
    			break;
    		} 
    	}
    }
}