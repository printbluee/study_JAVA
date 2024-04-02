import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 1개 입력 >> ");
		int one = input.nextInt();

		System.out.print("정수 1개 입력 >> ");
		int two = input.nextInt();
		
		System.out.println("one : " + one + "/ two : " + two);
		
		input.close();
		
	}

}
