
/*
 * 같은 경로(패키지)에 같은 이름의 class 생성 불가능
 */

//class Fruit { // error !
//	
//}

class FruitTwo {
	int count;
	String sort;
	
	
	// setter / getter 단축키 : 알트 + 쉬프트
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getSort() {
		return sort;
	}
	
	public void setSort(String sort) {
		this.sort = sort;
	}
	
}

public class InstanceEx04 {

	public static void main(String[] args) {

	}

}
