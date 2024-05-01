
/*
 * [ IS-A 관계 ]
 * : ~ 는 ~다. ==> 정의
 * 		ex 1) 학생은 사람이다. (o)
 * 		ex 2) 사람은 학생이다. (x)
 * 
 * 자식 : 학생
 * 부모 : 사람
 * 
 * [ HAS-A 관계 ] 소유관계, 포함관계
 * : ~가(는) ~를 소유(포함)하고 있다, 
 * 		ex 1) 폰은 카메라를 포함하고 있다. (o)
 * 		ex 2) 카메라가 폰을 포함하고 있다. (x)
 * 		ex 3) 경찰관이 총을 가지고 있다.   (o)
 * 
 * 자식 : 폰, 경찰관
 * 부모 : 카메라, 총
 * 
 * 상속으로 나타낼 수 있지만, 개념상 상속과 다름
 * 
 */

class Student { // 원래는 최상위 부모를 상속 받는 것 (object) class Student extends object

	@Override
	public String toString() {
        return "Student class ...";
    }
}

public class InheritanceEx04 {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());
		
		
	}

}
