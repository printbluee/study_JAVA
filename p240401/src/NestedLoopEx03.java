
public class NestedLoopEx03 {

	public static void main(String[] args) {

		for (int i=0; i<3; i++) {
			System.out.println("*** 바깥쪽 for문 " + (i+1) + "차 회전 ***");
			
			for (int j=0; j<3; j++) {
				System.out.println("안쪽 for문 " + (j+1) + "차 회전");
				System.out.println("바깥쪽 for문의 변수 i ==> " + i);
			}
		}
		
//		System.out.println("[바깥쪽 for문 영역] 안쪽 for의 변수 j >> " + j);
		
		System.out.println();
	}

}
