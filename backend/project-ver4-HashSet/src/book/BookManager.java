package book;

import java.util.HashSet;
import java.util.Scanner;

public class BookManager {
	private HashSet<AnimalInfo> infoStorage = new HashSet<AnimalInfo>();
	public static Scanner input = new Scanner(System.in);
	
	// [입력] 저장 =========================================
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		AnimalInfo info = search(name);
		
		if(info != null) {
			System.out.println("이미 저장된 이름입니다.");
			return;
		}
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	// [검색] ==============================================
	public void searchData() {
		System.out.print("검색할 이름을 입력하세요... ");
		String name = input.next();
		
		AnimalInfo info = search(name);
		
		if(info == null) {
			System.out.println("해당 데이터는 없습니다.");		
		} else {
			 info.showAnimalInfo();
			System.out.println("검색이 완료되었습니다.");		
		}		
	}
	
	
	// [수정] ==============================================
	public void updateData() {
		System.out.print("수정할 이름을 입력하세요... ");
		String name = input.next();
		
		AnimalInfo info = search(name);
		
		if(info == null) {
			System.out.println("해당 데이터는 없습니다.");
			return;
		}
		
		System.out.print(name + "의 수정할 이름 입력... ");
		String updateName = input.next();
		
		System.out.print(name + "의 수정할 나이 입력... "); 
		int updateAge = input.nextInt();
		
		infoStorage.remove(info);
        info.setName(updateName);
        info.setAge(updateAge);
        infoStorage.add(info);
		System.out.println("수정이 완료되었습니다.");
	}	
	
	// [삭제] ==============================================
	public void deleteData() {
		System.out.print("삭제할 이름을 입력하세요... ");
		String name = input.next();
		
		AnimalInfo info = search(name);
		
		if(info == null) {
			System.out.println("해당 데이터가 없습니다.");		
			return;
		} 
		
		System.out.println("정말 삭제하겠습니까? (Y/N) ");
		
		String answer = input.next().toUpperCase();
		
		if(answer.equals("N") || answer.equals("NO")) {
			System.out.println("삭제 진행을 취소했습니다.");
			return;
		}		
		
		System.out.println("삭제를 진행합니다.");
        infoStorage.remove(info);
        System.out.println("삭제가 완료되었습니다.");
	}
	

	private AnimalInfo search(String name) {
		for(AnimalInfo info : infoStorage) {
			if(info.getName().equals(name)) {
				return info; 
			}
		}
		
		return null;
	}
	
	// [전체 정보 출력] ====================================
	public void showBook() {
		System.out.println("\n<< 저장 목록 >> ");
		
		for(AnimalInfo info : infoStorage) {
			info.showAnimalInfo();
		}
	}
}