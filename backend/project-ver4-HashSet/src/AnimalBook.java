import book.BookManager;
import book.Menu;

public class AnimalBook {
	private static BookManager manager = new BookManager();
	
	public static void main(String[] args) {
		int choice;
		
		menu:
		while(true) {
			Menu.show();
			choice = BookManager.input.nextInt();
			
			switch(choice) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData(); 
				break;
			case 3:
				manager.updateData();
				break;
			case 4:
				manager.deleteData();
				break;
			case 5:
				manager.showBook();
				break;
			default:
				System.out.println("** 프로그램을 종료합니다. **");
				break menu;
			} 		
		}
	}
}
