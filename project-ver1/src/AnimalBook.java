import java.util.Scanner;

import book.BookManager;

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
                // 사용자가 Y 입력했을 때 입력 메소드 실행
                manager.inputData();
            } else if (userVaule.equalsIgnoreCase("n") || userVaule.equalsIgnoreCase("no")) {
                // 사용자가 N 입력했을 때 정보 출력 메소드 실행
                manager.showBook();
                input.close();
                break;
            }
        }
        System.out.println("정보 입력을 종료합니니다.\n");
    }
}