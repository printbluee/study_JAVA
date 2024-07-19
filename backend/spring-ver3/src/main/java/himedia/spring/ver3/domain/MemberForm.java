package himedia.spring.ver3.domain;

//===========================
//[VO] Value Object
// : setter 사용 x
//===========================
public class MemberForm {

	private String name;
	
	public MemberForm(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
}
