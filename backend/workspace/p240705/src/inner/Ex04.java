package inner;

interface Yahoo {
	public void showNum();
}

class OuterFour {
    // Inner class의 접근 권한을 private로 설정했기 때문에 외부에서 객체 생성 불가능 
    // outer class에 Inner class를 생성하는 getter 생성
    public Yahoo getInner(int num) {
    	return new InnerFour(num);
    }
    
    private class InnerFour implements Yahoo {
        int num;

        public InnerFour(int num) {
            this.num = num;
        }

        public void showNum() {
            System.out.println("[Inner class] num >> " + this.num);
        }
    }
}

public class Ex04 {

    public static void main(String[] args) {

        OuterFour outer = new OuterFour();

        // OuterFour.InnerFour in = outer.new InnerFour(5);
        // in.showNum();
        // OuterFour asd = outer.getInner(6);
        Yahoo in = outer.getInner(6);
        in.showNum();
        System.out.println("in >> " + in);
        
        Yahoo in2 = outer.getInner(7);
        System.out.println("in2 >> " + in2);
    }
}