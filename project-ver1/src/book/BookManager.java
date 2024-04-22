package book;

import java.util.Scanner;

public class BookManager {
	
	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;
	
	public void inputData() {
		@SuppressWarnings("resource") // 닫기 가능 유형의 자원 사용에 관련된 경고 억제
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		System.out.println();
		
		AnimalInfo animal = new AnimalInfo(name, age);
		infoStorage[index++] = animal;
	}
	
	public void showBook() {
		for (int i=0; i<index; i++) {
			infoStorage[i].showAnimalInfo();
			if (i < index-1) {
				System.out.println("\n"); // 배열의 마지막 요소에만 화이트 라인
			}
		}
	}
}