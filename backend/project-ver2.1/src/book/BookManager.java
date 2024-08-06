package book;

import java.util.Scanner;

public class BookManager {
	
	private final int MAX_CNT = 5;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;
	public static Scanner input = new Scanner(System.in);

	// [중복 검사] ==================================================
	private int search(String name) {
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				return i;
			} 
		}
		return -1;
	}
	// [1. 정보 입력(저장)] =========================================
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		int searchIndex = search(name);
		
		if (searchIndex != -1) {
			System.out.println("이미 저장된 이름입니다.");
			return;
		}
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	// [2. 정보 검색] ===============================================
	public void searchData() {
		System.out.print("검색할 이름을 입력하세요 ... ");
		String name = input.next();
		
		int searchIndex = search(name);
		
		if (searchIndex == -1) {
			System.out.println("해당 데이터는 없습니다.");
		} else {
			infoStorage[searchIndex].showAnimalInfo();
			System.out.println();
		}
	}
	// [3. 정보 수정] ===============================================
	public void updataData() {
		System.out.print("수정할 이름을 입력하세요 ... ");
		String name = input.next();
		
		int searchIndex = search(name);
		
		if (searchIndex == -1) {
			System.out.println("해당 데이터는 없습니다.");
			return;
		} 
		
		System.out.print(name + "의 수정할 이름 입력 ... ");
		String reName = input.next();
		System.out.print(name + "의 수정할 나이 입력 ... ");
		int age = input.nextInt();
		
		infoStorage[searchIndex].setName(reName);
		infoStorage[searchIndex].setAge(age);
		System.out.println("수정이 완료되었습니다.");
	}
	// [4. 정보 삭제] ===============================================
	public void deleteData() {
		System.out.print("삭제할 이름을 입력하세요 ... ");
		String name = input.next();
		
		int searchIndex = search(name);
		
		if (searchIndex == -1) {
			System.out.println("해당 데이터는 없습니다.");
			return;
		} 
		
		String answer = "";
		
		choice:
		while(true) {
			System.out.print("정말 삭제하겠습니까 ? (Y/N) ");
			answer = input.next().toUpperCase();
			
			switch (answer) {
			case "Y":
				for (int j=searchIndex; j<index; j++) {
					infoStorage[j] = infoStorage[j+1];
				}
				index--;
				System.out.println("삭제를 진행합니다.");
				System.out.println("삭제가 완료되었습니다.");
				break choice;
			case "N":
				System.out.println("삭제 진행을 취소했습니다.");
				break choice;
			}
		}
	}
	// [5. 전체 정보 출력] ==========================================
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for(int i=0; i<index; i++) {
			infoStorage[i].showAnimalInfo();
			System.out.println();
		}
	}
}