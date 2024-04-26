package item;

public class ItemBusinessRule {

	private static final Item[] store = new Item[100];
	private static int sequence;
	
	// ========================================================
	private Item findById (int itemId) {
		for (int i=0; i<sequence; i++) {
			if (store[i] != null && store[i].getId() == itemId) {
				return store[i];
			}
		}
		return null;
	}
	// 상품 저장 ===============================================
	public void save () {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요 ... ");
		String name = ItemView.input.next();
		Integer price = ItemView.input.nextInt();
		int quantity = ItemView.input.nextInt();
		
		store[sequence++] = new Item(name, price, quantity);
		System.out.println("상품 정보가 저장되었습니다.");
	}
	// 상품 조회 ===============================================
	public void find () {
		System.out.print("조회를 원하는 아이디를 입력하세요 ... ");
		int id = ItemView.input.nextInt();
		Item searchInfo = findById(id);
		
		if (searchInfo != null) {
			searchInfo.showInfo();
			System.out.println();
		} else {
			System.out.printf("아이디 %s인 상품이 없습니다.\n", id);
			return;
		}
	}
	// 상품 수정 ===============================================
	public void update () {
		System.out.print("수정하기 원하는 아이디 입력하세요 ... ");
		int id = ItemView.input.nextInt();
		Item searchInfo = findById(id);
		
		if (searchInfo != null) {
			System.out.print("가격, 수량을 입력하세요 ... ");
			Integer price = ItemView.input.nextInt();
			int quantity = ItemView.input.nextInt();
			searchInfo.setPrice(price);
			searchInfo.setQuantity(quantity);
		} else {
			System.out.printf("아이디 %s인 상품이 없습니다.\n", id);
			return;
		}
		System.out.println("상품 수정이 완료되었습니다.");
	}
	// 상품 삭제 ===============================================
	public void delete () {
		System.out.print("삭제를 원하는 아이디 입력하세요 ... ");
		int id = ItemView.input.nextInt();
		Item searchInfo = findById(id);
		
		if (searchInfo != null) {
			for (int i=searchInfo.getId(); i<sequence; i++) {
				store[i] = store[i+1];
			}
			sequence--;
			System.out.printf("%s번 상품이 삭제 되었습니다.\n", id);
			System.out.println("상품이 삭제가 완료되었습니다.");
		} else {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
	}
	// 상품 전체 조회 ==========================================
	public void findAll () {
		for (Item info: store) {
			if (info != null) {
				info.showInfo();
				continue;
			} else if (sequence == 0)
				System.out.println("저장된 상품 정보가 없습니다.");
				return;
			}
		
//		boolean cheak = false;
//		for (Item info: store) {
//			if (info != null) {
//				info.showInfo();
//				System.out.println();
//				cheak = true;
//			} 
//		}
//		if (! cheak) {
//			System.out.println("저장된 상품 정보가 없습니다.");
//		}
	}
	// 상품 전체 삭제 ==========================================
	public void clearStore () {
		for (int i=0; i<sequence; i++) {
			store[i] = store[sequence + 1];
		}
		sequence = 0;
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
}
