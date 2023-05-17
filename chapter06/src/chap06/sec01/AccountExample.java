/*문제7] 입금 (deposit), 출금(withdraw), 잔고확인(getbalance)을 수행하는 계좌클래스(Account)를 생성하시오.
입금처리메소드 출금메소드 잔고확인메소드
필요한 정보- 이름, 잔고
1.잔고확인
사용자가 출금하기 원하는 액수와 사용자 2. 잔고 확인 같거나 잔고가크면 출금 가능 , 사용자 반환값있음(잔고)
3. 입금한 액수만큼 잔고에 플러스 반환값없음
4. 잔고 빼주기 
*/

package chap06.sec01;

public class AccountExample {

	public static void main(String[] args) {
		new AccountExample().start();
		}

	private void start() {
		Account account =new Account("홍길동"); //주메뉴
		account.deposit(10000);         //
		printInfo(account);
		int amt=account.withdraw(5000);
		System.out.println("출금금액 : "+amt);
		printInfo(account);
	}

public void printInfo(Account account) {
	System.out.println("계좌주: "+account.getAccountOwner());
	System.out.println("잔고: "+account.getBalance());
}
	}

