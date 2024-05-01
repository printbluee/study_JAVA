
import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	private static ItemBusinessRule manager = new ItemBusinessRule();
	
	public static void main(String[] args) {

		String userValue;
		
		menu:
		while (true) {
			ItemView.showMenu();
			
			userValue = ItemView.INPUT.next();
			switch(userValue) {
        	case "1":
        		manager.save();
        		break;
        	case "2": 
        		manager.find();
        		break;	
        	case "3": 
        		manager.update();
        		break;
        	case "4": 
        		manager.delete();
        		break;
        	case "5": 
        		manager.findAll();
        		break;
        	case "6": 
        		manager.clearStore();
        		break;
        	case "7": 
        		System.out.println("프로그램이 종료되었습니다.");
        		break menu;
        	}
		}
		ItemView.INPUT.close();
	}
}
