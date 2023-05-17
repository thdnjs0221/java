package chap06.sec01;

public class Account {
private String accountOwner;
private int balance;


Account(){}
Account(String accountOwner){
	this.accountOwner=accountOwner;
	balance=0;
			
}

public void deposit(int amount) {          //입금할 액수 들어와야함
	balance+=amount;					   //balance가 입금할 액수만큼 늘어남
										   // 되돌려 주는값 없음 void
}
public int withdraw(int amount) {		  //출금할 액수 
	if(balance<amount) {
		System.out.println("잔고 부족합니다..");
		amount=0;							//되돌려줄값 0
	}else {
		balance-=amount;                   //
	}
	return amount;						 //if문 마지막에 하나 return?
    }
public int getBalance() {
	return balance;
	
}
public String getAccountOwner() {
	return accountOwner;
}
}