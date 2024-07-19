
package item;

public class ItemBusinessRule {

	private static final Item[] store = new Item[100];
	private static int sequence = 0;
	private int id = 1;

	// 상품 아이디 찾기 ============================================
	private Item findById(int itemId) {
		for (int i=0; i<sequence; i++) {
			if (store[i].getId() == itemId) {
				return store[i];
			}
		}
		return null;
	}
	// 상품 아이디의 인덱스 찾기 ===================================
	private int findIndexById(int itemId) {
		for(int i=0; i<sequence; i++) {
			if(store[i].getId() == itemId) {
				return i;
			}
		}
		return -1;
	}
	// [1] 상품 저장 ===============================================
	public void save() {
		if (sequence >= 100) {
			System.out.println("더 이상 저장할 수 없습니다.\n");
			return;
		}
		
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요 ... ");
		String name = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();

		store[sequence++] = new Item(id++, name, price, quantity);
		System.out.println("상품 정보가 저장되었습니다.");
	}

	// [2] 상품 조회 ===============================================
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요 ... ");
		int itemId = ItemView.INPUT.nextInt();
		Item searchInfo = findById(itemId);

		if (searchInfo != null) {
			searchInfo.showInfo();
			System.out.println();
		} else {
			System.out.printf("아이디 %s인 상품이 없습니다.", itemId);
			return;
		}
	}

	// [3] 상품 수정 ===============================================
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요 ... ");
		int itemId = ItemView.INPUT.nextInt();
		Item searchInfo = findById(itemId);

		if (searchInfo != null) {
			System.out.print("가격, 수량을 입력하세요 ... ");
			Integer price = ItemView.INPUT.nextInt();
			int quantity = ItemView.INPUT.nextInt();
			
			searchInfo.setPrQu(price, quantity);
			System.out.println("상품 수정이 완료되었습니다.");
			return;
		} 
		System.out.printf("아이디 %s인 상품이 없습니다.\n", itemId);
	}

	// [4] 상품 삭제 ===============================================
	public void delete() {
		System.out.print("삭제를 원하는 아이디를 입력하세요 ... ");
		int itemId = ItemView.INPUT.nextInt();
		Item searchInfo = findById(itemId);

		if (searchInfo == null) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		
		int indexDelete = findIndexById(itemId); 
		System.out.println("indexDelete >> " + indexDelete);
		for (int i=indexDelete; i<sequence; i++) {
			store[i] = store[i + 1];
		}
		sequence--;
		System.out.printf("%s번 상품이 삭제 되었습니다.\n", id);
		System.out.println("상품이 삭제가 완료되었습니다.");
	}
	// [5] 상품 전체 조회 ==========================================
	public void findAll() {
		boolean cheak = false;
		for (Item info : store) {
			if (info != null) {
				info.showInfo();
				cheak = true;
			}
		}
		if (!cheak) {
			System.out.println("저장된 상품 정보가 없습니다.");
		}
	}
	// [6] 상품 전체 삭제 ==========================================
	public void clearStore() {
		for (int i=0; i<sequence; i++) {
			store[i] = null;
		}
		sequence = 0;
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
}