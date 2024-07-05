package p240512;
import java.util.Scanner;

public class Quiz06 {
	
	// 숫자 피라미드 
	
    public static void main(String[] args) {
    	
    	// Scanner 객체 생성
        Scanner input = new Scanner(System.in);
        System.out.print("입력: ");
        
        // 높이
        int height = input.nextInt();
        int num = 1;
        
        for (int i=1; i<=height; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
        // 메모리 해제
        input.close();
    }
}
