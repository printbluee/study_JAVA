
public class ParameterQuiz {

	public static String concat(String ... args) {
		
		// 초기값 설정
		String reslut = "";
		
		for (String ar: args) {
			reslut += ar;
		}
		return reslut;
	}
	
	public static void main(String[] args) {
		
		String[] one = {"하나", "둘", "셋"};
		System.out.println(concat(one)); // 하나둘셋
		
		// "넷", "다섯", "여섯
		 System.out.println(concat("넷", "다섯", "여섯")); // 넷다섯여섯
		
	}
}