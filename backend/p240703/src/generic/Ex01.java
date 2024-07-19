package generic;

class Thing {
	
	private String id;
	private String name;
	
	public Thing() {}
	
	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 Tv";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen";
	}
}

class Gift<T> {
	private T item;
	
	public void wrap(T item) {
		System.out.println("[선물을 포장합니다]");
		this.item = item;
	}
	
	public T unWrap() {
		System.out.println("[선물 상자를 열다]");
		return this.item;
	}
}


public class Ex01 {
	
	public static void unWrapGift(Gift<? super Pen> gift) {
		Thing pen = (Thing) gift.unWrap();
		System.out.println(pen);
	}
	
	public static void main(String[] args) {
		Gift<Pen> p = new Gift<Pen>();
		p.wrap(new Pen());
		unWrapGift(p);
		
		Gift<Tv> t = new Gift<Tv>();
		t.wrap(new Tv());
		// unWrapGift(t); error ! : 타입 지정이 Pen
		
		Gift<Thing> th = new Gift();
		
	}
}
