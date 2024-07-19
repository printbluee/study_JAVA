package inner;

class OuterTwo {
    String name = "홍길동";
    int age = 100;

    public void show() {
        System.out.println("Outer class >> show() 실행");
    }

    // ===============
    class InnerTwo {
        String name = "INNER";
        String innerID = "1111";

        public String getName() {
            return name;
        }

        public void setName(String name) {
//            this.name = name;
            OuterTwo.this.name = name; // Outer 멤버 접근하여 setName()으로 변경 가능
        }

        public void showName() {
//            System.out.println("[Outer class 멤버 접근] >> " + OuterTwo.this.name) ;
            System.out.println("[Inner class] outer member : name field >> " + OuterTwo.this.name);
            System.out.println("[Inner class] inner member : name field >> " + name);
            System.out.println("age >> " + age); // Inner에 본인의 age가 없어서 상위로 찾아가서 사용한다.
        }
    }
}

public class Ex02 {

    public static void main(String[] args) {
        // Outer 객체 생성없이 바로 생성하는 법
//        OuterTwo.InnerTwo in = new OuterTwo().new InnerTwo(); 
//        System.out.println(in);

        // Inner class InnerTwo 인스턴스 생성
        System.out.println("\n<< [InnerTwo] 인스턴스 in 생성 >>");
        OuterTwo out = new OuterTwo();
        OuterTwo.InnerTwo in = out.new InnerTwo();

        in.setName("박보검");

        in.showName();
        //out.show();

        System.out.println("\n<< [InnerTwo] 인스턴스 in2 생성 >>");
        OuterTwo.InnerTwo in2 = out.new InnerTwo();
//        in2.setName("이미자");
        in2.showName();

    }

}