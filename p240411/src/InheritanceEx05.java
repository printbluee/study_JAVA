
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

class Police extends Gun {
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

public class InheritanceEx05 {
	public static void main(String[] args) {
		
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
		
	}
}
