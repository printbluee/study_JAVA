package exception;

public class Ex01 {

	public static void main(String[] args) {

		// Thread.sleep(1000); // 1초
		 
		for (int i=1; i<11; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
