
// 상속 o
/*
 * class Police extends Gun {
	int handcuffs; // 수갑
	
	public Police(int bnum, int bcuff) {
		super(bnum);
		handcuffs--;
	}
	public void putHandcuff() {
		System.out.println("SNAP !");
		handcuffs--;
	}
}
 */

class Gun {
	int bullet; // 총알
	
	public Gun(int bnum) {
		bullet = bnum;
		System.out.println("[Gun] Gun() ==> bullet : " + bullet);
	}
	public void shoot() {
		System.out.println("BBANG !");
		bullet--;
		System.out.println("[Gun] shoot() ==> bullet : " + bullet);
	}
}

// 상속 x / 포함관계
class Police {
	// 필드 -> heap 영역
	int handcuffs;
	Gun pistol; // 참조 자료형 - 레퍼런스 타입, 필드에 참조변수가 온다면 객체에서 다른 객체를 관리한다는 것
	
	// 생성자
	public Police (int bnum, int bcuff) {
		System.out.println("[Police] Police() 실행");
		this.handcuffs = bcuff;
		System.out.println("[Police] Police() handcuffs ==> " + handcuffs);
		
		if (bnum != 0) {
			this.pistol = new Gun(bnum);
			System.out.println("[Police] Police() ==> pistol : " + pistol);
		} else {
			this.pistol = null;
		}
	}
	
	// 메소드
	public void putHandcuff() {
		System.out.println("SNAP");
		handcuffs--;
		System.out.println("[Police] putHandcuff() ==> handcuffs : " + handcuffs);
	}
	
	public void shoot() {
		System.out.println("[Police] shoot() 실행");
		if (pistol == null) {
			System.out.println("Hut BBang");
		} else {
			pistol.shoot();
		}
	}
}


public class InheritanceEx05 {
	public static void main(String[] args) {
		
		System.out.println("1번째");
		Police pman = new Police(5, 3);
		// [Gun] Gun() ==> bullet : 5
		// [Police] Police() ==> pistol : Gun@33c7353a
		
		System.out.println("2번째");
		pman.shoot();
		System.out.println("3번째");
		pman.putHandcuff();
		
	}
}
