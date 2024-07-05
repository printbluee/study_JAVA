package p240512;
import java.util.Scanner;

public class Quiz07 {
	
	// 총점 / 평균 점수 / 등급 구하기

	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
        int totalScore = 0;   // 점수
        int subjectCount = 0; // 과목수

        System.out.println("점수를 입력하세요. 입력을 마치려면 음수를 입력하세요.");

        while (true) {
            System.out.print("점수 입력: ");
            int score = input.nextInt(); // 점수

            if (score < 0) { // 점수 입력 그만하고자 할 때 음수 입력
                break;
            }

            totalScore += score;
            subjectCount++;
        }

        double averageScore = (double) totalScore / subjectCount;

        System.out.println("총점: " + totalScore);
        System.out.println("평균 점수: " + averageScore);

        // 등급
        if (averageScore >= 90) {
            System.out.println("등급: A");
        } else if (averageScore >= 80) {
            System.out.println("등급: B");
        } else if (averageScore >= 70) {
            System.out.println("등급: C");
        } else if (averageScore >= 60) {
            System.out.println("등급: D");
        } else {
            System.out.println("등급: F");
        }
        
        // 메모리 해제
        input.close();
	}
}
