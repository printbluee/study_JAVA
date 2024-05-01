
class Gun {
	int bullet; // 총알
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBANG !");
		bullet--;
	}
}

// 상속 x / 포함관계
class Police {
	// 필드 -> heap 영역
	int handcuffs;
	Gun pistol; // 참조 자료형 - 레퍼런스 타입, 필드에 참조변수가 온다면 객체에서 다른 객체를 관리한다는 것
	
	// 생성자
	public Police (int bnum, int bcuff) {
		handcuffs = bcuff;
		
		if (bnum != 0) {
			pistol = new Gun(bnum);
		} else {
			pistol = null;
		}
	}
	
	// 메소드
	public void putHandcuff() {
		System.out.println("SNAP");
		handcuffs--;
	}
	
	public void shoot() {
		if (pistol == null) {
			System.out.println("Hut BBang");
		} else {
			pistol.shoot();
		}
	}
}

// 상속 o
//class Police extends Gun {
//	int handcuffs; // 수갑
//	
//	public Police(int bnum, int bcuff) {
//		super(bnum);
//		handcuffs--;
//	}
//	public void putHandcuff() {
//		System.out.println("SNAP !");
//		handcuffs--;
//	}
//}

public class InheritanceEx05 {
	public static void main(String[] args) {
		
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
		
	}
}
