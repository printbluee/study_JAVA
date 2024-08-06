package inner;

/*
 
=========================================
[inner class가 outer class의 멤버 접근 가능]
inner class로 생성된 여러 개 객체가 있다면,
outer class로 생성된 객체의 멤버를 따로 사용하나요?
공유 하나요?
==========================================
*/

class Outerthree {
    String outerName;

    class InnerThree {
        String innerName;


        public void setOuterName(String name) {
            Outerthree.this.outerName = name;
        }

        public void setInnerName(String name) {
            this.innerName = name;
        }

        public void showAllName() {
            System.out.println("[outer field]" + Outerthree.this.outerName);
            System.out.println("[inner field]" + innerName);

        }
    }
}

public class Ex03 {

    public static void main(String[] args) {

        Outerthree outer = new Outerthree();
        Outerthree.InnerThree inner = outer.new InnerThree();

        inner.setInnerName("안 쪽 홍길동");

        inner.setOuterName("바깥 쪽 홍길동");

        inner.showAllName();
    }
}