package book;

import java.util.Scanner;

public class BookManager {

	final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;
	
	public BookManager() {} 
	
	public void inputDate() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.\n");
		input.close();
	}
	
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for (AnimalInfo idx: infoStorage) {
			if (idx == null) {
				break;
			}
			idx.showAnimalInfo();
		}
	}
}