package item;

public class Item {
	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	private static int nextUniqueID = 0;
	
	public Item (String itemName, Integer price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		nextUniqueID++;
		this.id = nextUniqueID;
	}
	
	public Item() {
		nextUniqueID++;
		this.id = nextUniqueID;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void showInfo() {
		System.out.printf("%d\t%s\t\t%d\t%d\n", this.id, this.itemName, this.price, this.quantity);
	}
}
