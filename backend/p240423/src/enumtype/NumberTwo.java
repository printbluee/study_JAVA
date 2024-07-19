
// 파일 형태 : enum
// Ex05 파일과 함께 보기

package enumtype;

public enum NumberTwo {

	ONE(1), TWO(2), TRHEE(3), FOUR(4); // 필드의 값을 지정하기 위해 field 와 매겨변수 1개 받는 생성자 정의하기
	
//	private int number;
	private Integer number;
	
	private NumberTwo(Integer number) {
		this.number = number;
	}
	
//	error ! int 인데 string 이라서
//	@Override
//	public String toString() {
//		return this.number; 
//	}
	
	@Override
	public String toString() {
		return number.toString();       
	}
	// (String)this.number + private int number;
	// error ! primitive 타입을 referance 타입으로 바꿀 수 없음
	// (String)this.number + private Integer number;
	// error ! referance 타입으로 바꿔도 상속 관계여야함
	
	public Integer getNumber() {
		return number;
	}
}

