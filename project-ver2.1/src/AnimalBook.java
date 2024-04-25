
import book.BookManager;
import book.Menu;

/*
 * [과제] - 구현 미완료 !
 * 1) 입력 - o
 * 	: 이름 입력 후 , 존재하는 이름이면, "이미 저장된 이름입니다." 를 출력
 * 
 * 같은 이름이 있을 때 -> 이미 저장된 이름입니다. 출력
 * 같은 이름이 없을 때 -> 나이 입력 후 데이터 입력 완료 출력
 * 
 * 2) 수정 - o
 * 	: 이름과 나이를 수정
 * 
 * 수정할 이름을 입력하세요 ... 해피
 * 해피의 수정할 이름 입력 ... 해핑   // 이름 수정 안할거면 해피 넣어야함
 * 해피의 수정할 나이 입력 ... 100
 * 수정이 완료되었습니다.
 * 
 * 
 * 3) 삭제 - x
 * 	: 삭제시, 삭제 여부를 확인 
 * 
 * 삭제할 이름을 입력하세요 ... 해핑
 * 정말 삭제하겠습니까 ? (Y/N) Y // 대문자 소문자 둘다 받음
 * 삭제를 진행합니다.
 * 삭제가 완료되었습니다.
 * 삭제할 이름을 입력하세요 ... 초코
 * 정말 삭제하겠습니까 ? (Y/N) n
 * 삭제 진행을 취소했습니다.
 */

public class AnimalBook {

    // static field
    private static BookManager manager = new BookManager();
    
    public static void main(String[] args) {

    	int userValue;
    	
    	menu:
        while(true) {
        	
        	Menu.show(); // 메뉴판

        	userValue = BookManager.input.nextInt();
        	switch(userValue) {
        	case 1:
        		manager.inputData();  	// 1. 정보 입력(저장)
        		break;
        	case 2: 
        		manager.searchData();	// 2. 정보 검색
        		break;	
        	case 3: 
        		manager.updataData(); 	// 3. 정보 수정
        		break;
        	case 4: 
        		manager.deleteData(); 	// 4. 정보 삭제
        		break;
        	case 5: 
        		manager.showBook();		// 5. 전체 정보
        		break;
        	case 6: 
        		System.out.println("++ 프로그램을 종료합니다. ++");
        		break menu;   			// 6. 종료
        	}
        }
    	BookManager.input.close();
    }
}