
public class ForEx02 {

	public static void main(String[] args) {
		
		int idx = 1;
		
		for (;;) { // 조건식이 없어서 무한루프
			System.out.println("idx >> " + idx);
			
			if (idx == 2) {
				break;
			}
			idx++;
		}
		
		// while 문의 무한 루프 (정확하게 명시해둠 true)
//		while (true) {
//			명령어;
//		}
		
//		System.out.println("반복문 실행 후 idx >> " + idx);
	}
}
