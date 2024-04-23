import book.BookManager;
import java.util.Scanner;

public class AnimalBook {

    // static field
    private static BookManager manager = new BookManager();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userValue;

        do {
            System.out.println("[ 메뉴를 선택하세요 ]");
            System.out.println("1. 정보 입력\n2. 정보 검색\n3. 정보 수정\n4. 정보 삭제\n5. 전체 정보\n6. 종료");
            System.out.print("선택 ... ");
            userValue = input.nextInt();

            switch (userValue) {
                case 1:
                    manager.inputData();
                    break;
                case 2:
                    manager.searchData();
                    break;
                case 3:
                    manager.updataData();
                    break;
                case 4:
                    manager.deleteData();
                    break;
                case 5:
                    manager.showBook();
                    break;
                case 6:
                    System.out.println("++ 프로그램을 종료합니다. ++");
                    input.close();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }

        } while (userValue != 6);
        
        input.close();
        
    }
}