
public class IfEx04 {

	public static void main(String[] args) {
		
		int num = 100;
		
		if (num < 0) {
			System.out.println("0 미만");
		} else {
			if (num < 100) {
				System.out.println("100 미만");
			} else {
				System.out.println("100 이상");				
			}
		}
	}
}
