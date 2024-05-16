
import java.util.Scanner;

public class TyQuiz0514 {
	
	public static void main(String[] args) {
     
		Scanner input = new Scanner(System.in);
		
		int userRow = 0; // 행 
		int userCol = 0; // 열
		
		int userValue; 
		int minValue = 1;
		int maxValue = 10;
		
        boolean valueCheck = false;
        do {
            String msg = valueCheck ? "열의" : "행의";
            System.out.print(msg + " 크기를 입력하세요. (정수 1~10 사이의 수) : ");
            
            userValue = input.nextInt();
            if (userValue >= minValue && userValue <= maxValue) {
                if (valueCheck) { // 행 값 넣기
                    userCol = userValue;
                    break;        // break 를 해도 아직 while 문의 true 해당 (valueCheck)
                } else { 		  // 열 값 넣기
                    userRow = userValue;
                    valueCheck = true; // 행, 열 값 들어왔을 때 브레이크 조건
                }
            }
        } while (true);
        
        int[][] arr = new int[userRow][userCol];
        
        for (int[] row: arr) {
        	 for (int i=0; i<row.length; i++) {
        		 int random = (char)((int)(Math.random()*26)+65);
            	row[i] = random;
            	System.out.print((char)row[i] + " ");
            }
            System.out.println();
        }
        
		input.close();
    }
}