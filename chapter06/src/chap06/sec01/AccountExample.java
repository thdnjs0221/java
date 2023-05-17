package chap06.sec01;

public class AccountExample {

	public static void main(String[] args) {
		new AccountExample().start();
		}

	private void start() {
		Account account =new Account("홍길동"); //주메뉴
		account.deposit(10000);         //
		
	}


	}




