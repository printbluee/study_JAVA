package generic;

class Test {
	
    private int element;

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}

public class Ex01 {
    public static void main(String[] args) {

        Test t = new Test();
        t.setElement(5);
        System.out.println(t.getElement());

//        Test str = new Test();
//        str.setElement("안녕");
//        System.out.println(t.getElement());
    }
}