package inner;

class OuterFive {
	
	/* [static inner class]================== : 외부에서 Outer class의 객체 생성 없이 Inner
	 * class 접근 가능 : instance와 static의 모든 field 선언과 method 정의 가능
	 */
	
	static class InnerFive {// instance field
	    int num = 5;

        // static field
        static int user = 10;

        // 생성자
        public InnerFive() {
            System.out.println("[Inner class ] 생성자 실행");
        }
        // 메소드
        public void showInstanceMethod() {
            System.out.println("== showInstanceMethod() ==");
            System.out.println("[instance field] num >> " + num);
            System.out.println("[static field] user >> " + user);
        }
        public static void showStaticMethod() {
            System.out.println("== showStaticMethod() ==");
            // System.out.println("[instance field] num :" + num);  : static 은 instance 멤버 접근 불가능
            System.out.println("[static field] user >> " + user);
        }
    }
}

public class Ex05 {

    public static void main(String[] args) {

        // Error Inner class : instance 생성 안 됨!!
        // OuterFive out = new OuterFive();
        // OuterFive.InnerFive in = out.new InnerFive();

    	// OuterFive.InnerFive in = new OuterFive().new InnerFive();

        OuterFive.InnerFive in = new OuterFive.InnerFive();
        in.showInstanceMethod();
        // in.showStaticMethod();
        OuterFive.InnerFive.showStaticMethod();

    }

}