package p240512;

public class Quiz05 {
	
	// * 피라미드
	
    public static void main(String[] args) {
    	
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
