
import java.util.Scanner;

class HiBank {
	int accountNumber; // 계좌번호
	String owner; // 예금주
	int balance; // 잔액

	HiBank(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	public int getBalance() { // 현재 잔액 반환하는 메소드
		System.out.println("현재 잔액: " + this.balance + "원");
		return balance;
	}

	void deposit(int money) { // 입금 메소드
		balance += money;
		System.out.println(money + "원이 입금되었습니다.");
	}

	void withdraw(int money) { // 출금 메소드
		if (balance >= money) { // 출금액보다 잔액이 크거나 같은 경우에만 출금을 수행
			balance -= money;
			System.out.println(money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다."); // 잔액이 출금액보다 작으면 출금이 실패하고 실패 메시지를 출력
		}
	}
}

public class HjQuiz0516 {
	public static void menu() {
		System.out.println("\n<서비스 메뉴>\n"
				+ "1. 통장 개설\n"
				+ "2. 입금\n"
				+ "3. 출금\n"
				+ "4. 이용 종료");
		System.out.print("이용할 서비스를 입력해주세요 ... ");
	}
	
	public static void main(String[] args) {
		
	    HiBank account = null;
	    Scanner input = new Scanner(System.in);
	    
	    menu:
	    while (true) {
	        menu(); // 메뉴 표시
	        
	        int user = input.nextInt(); // 사용자 선택 입력
	        
	        switch (user) {
            case 1:  // 통장 개설
                if (account != null) {
                    System.out.println("이미 계좌가 개설되어 있습니다.");
                } else {
                	System.out.print("계좌번호를 입력하세요 (4글자): ");
                    int accountNumber = input.nextInt();
                    System.out.print("예금주를 입력하세요: ");
                    String owner = input.next();
                    System.out.print("초기 잔액을 입력하세요: ");
                    int balance = input.nextInt();
                    
                    account = new HiBank(accountNumber, owner, balance);
                    System.out.println("계좌가 개설되었습니다.");
                }
                break;
            case 2:  // 입금
                if (account == null) {
                    System.out.println("계좌가 개설되어 있지 않습니다.");
                } 
                System.out.print("입금할 금액을 입력하세요: ");
                int depositAmount = input.nextInt();
                account.deposit(depositAmount);
                account.getBalance();
                break;  
            case 3:  // 출금
                if (account == null) {
                    System.out.println("계좌가 개설되어 있지 않습니다.");
                } 
                System.out.print("출금할 금액을 입력하세요: ");
                int withdrawAmount = input.nextInt();
                account.withdraw(withdrawAmount);
                account.getBalance();
                break;
            case 4:  // 서비스 이용 종료
                System.out.println("서비스 이용을 종료합니다.");
                input.close(); // 메모리 해제
                break menu; 
            default:
                System.out.println("잘못된 입력입니다.");
                break;
	        }
	    }
	}
	
}