package p240512;

import java.util.Scanner;

public class Quiz03 {
		
	/*
	 * [문제]
	 * 유저가 먹은 수량만큼 입력 받아
	 * 메뉴 계산 영수증을 출력하시오.
	 * 단 총 수량은 1개 이상어야 한다.
	 * 
	 * <입력 문구>
	 * 돈까스 수량 : 10
	 * 칼국수 수량 : 1
	 * 왕만두 수량 : 5
	 * 
	 * <출력 문구>
	 * 돈가스 x 10 = 99000
	 * 칼국수 x  1 = 10000
	 * 왕만두 x  5 = 25000
	 * ==================
	 * 총합 :      134,000
	 */
	
	public static void menu(int donQty, int kalQty, int kingQty) {
        
		// 메뉴별 가격 설정
        int donPrice = 9900;
        int kalPrice = 10000;
        int kingPrice = 5000;

        // 각 메뉴의 총 가격 계산
        int donTotal = donPrice * donQty;
        int kalTotal = kalPrice * kalQty;
        int kingTotal = kingPrice * kingQty;
        int total = donTotal + kalTotal + kingTotal;

        // 각 메뉴별 출력문구 출력
        System.out.println("돈가스 x " + donQty + " = " + donTotal);
        System.out.println("칼국수 x  " + kalQty + " = " + kalTotal);
        System.out.println("왕만두 x  " + kingQty + " = " + kingTotal);
        System.out.println("==================");
        System.out.println("총합 :      " + String.format("%,d", total));
    }

    public static void main(String[] args) {
        
    	// Scanner 객체 생성
    	Scanner input = new Scanner(System.in);

        int totalQuantity; // 총 수량
        
        do {
            // 각 메뉴별 수량 입력 받기
            System.out.print("돈까스 수량: ");
            int donkatsuQty = input.nextInt();
            System.out.print("칼국수 수량: ");
            int kalguksuQty = input.nextInt();
            System.out.print("왕만두 수량: ");
            int wangmanduQty = input.nextInt();

            // 총 수량 계산
            totalQuantity = donkatsuQty + kalguksuQty + wangmanduQty;

            // 총 수량이 0인 경우 다시 입력 요청
            if (totalQuantity == 0) {
                System.out.println("적어도 한 메뉴의 수량은 1개 이상이어야 합니다.");
            } else {
                // 메뉴 계산 출력
                menu(donkatsuQty, kalguksuQty, wangmanduQty);
            }
        } while (totalQuantity == 0);
        
        // 메모리 해제
        input.close();
    }
}
