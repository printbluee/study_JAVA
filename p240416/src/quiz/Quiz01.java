package quiz;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10);
	}
}

class Tv extends Product {
	Tv () {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}


class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] basket = new Product[10];
	int top = -1;
	int total = 0;
	
	void buy(Product p) { 
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		top++;
		basket[top] = p;
		
		money -= p.price;
		total += p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 을/를 구입하셨습니다.");
	}
	
	public void summary() {
		
		String reslut = "";
		
		System.out.println("구입하신 물품의 총 금액 " + this.total + "만원입니다.");
		
		for (Product product: basket) {
			if (product != null) {
				reslut += product + ",";
			} 
		}
		System.out.println("구입하신 제품은 " + reslut + "입니다." );
	}
}

public class Quiz01 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		
		b.summary();
	}
}