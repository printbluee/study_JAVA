package quiz;

class Product {
	int price;      // 구매 가격
	int bonusPoint; // 보너스 포인트
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10); // 가격의 10%
	}
}

class Tv extends Product {
	Tv () {
		super(100); // Tv 의 가격 100
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200); // Computer 의 가격 200
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}


class Buyer {
	int money = 1000; 	// BuyerTwo 가 가지고 있는 돈 1000
	int bonusPoint = 0; // BuyerTwo 가 가지고 있는 보너스 포인트
	
//	int total = 0; 		// BuyerTwo 가 구매한 총 금액
	int idx = 0;		// 장바구니의 인덱스 값 설정(-1 부터 시작, 0부터 시작하기 위해) 							
	Product[] basket = new Product[10]; // ProductTwo 타입의 장바구니 선언(10 설정)
	
				
	void buy(Product p) { 				// 원래는 외부 접근보다는 setter/getter 쓰는게 훨씬 좋음, private 으로 해야 맞음
										// 기회될 때 private 타입으로 변경 후, setter/getter 사용해서 코드 작성하기
		if (money < p.price) {          // BuyerTwo 가 가지고 있는 돈보다 가격이 더 클 때
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		basket[idx++] = p;				// basket 에 요소값 대입 (Tv, Computer ...)
		
//		total += p.price;				// 구매한 제품 가격을 총 금액 대입
		money -= p.price;	 			// BuyerTwo 가 가지고 있는 돈에서 제품 가격 빼고 대입
		bonusPoint += p.bonusPoint;		// 제품 가격의 보너스 포인트를 BuyerTwo 가 가지고 있는 보너스 포인트에 대입
		System.out.println(p + " 을/를 구입하셨습니다."); // p = toString 메소드 실행
	}
	
	public void summary() {
		
		int total = 0;
		String list = "";			// 요소값을 빈문자열에 대입하여 한 문자열로 출력하기 위해 빈 문자열 선언
		
		// [일반 for문]
//		for (int i=0; i<idx; i++) { // basket.length 를 하면 null까지 돌고, idx 를 하면 조건식까지 안써도 됨
////			if (basket[i] == null) {
////				break;
////			}
//			total += basket[i].price;
//			list += basket[i] + ", ";
//		}
		
		// [향상된 for문]
		for (Product i: basket) {
			if (i == null) {
				break;
			}
			total += i.price;
			list += i + ", ";
		}

		System.out.printf("\n구입하신 물품의 총 금액은 %d만원 입니다.\n", total);
		System.out.printf("구입하신 제품은 %s 입니다.\n\n", list);
	}
}

public class Quiz01 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());		// basket[0] // 인수로 인스턴스를 넣을 것
		b.buy(new Computer()); 	// basket[1]
		b.buy(new Computer());	// basket[2]
		b.buy(new Computer());	// basket[3]
		b.buy(new Computer());	// basket[4]
		b.buy(new Tv());		// basket[5]
		
		b.summary();			// 출력 문구 출력
	}
}