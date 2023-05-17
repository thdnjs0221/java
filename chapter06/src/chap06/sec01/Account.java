package chap06.sec01;

public class Account {
private String accountOwner;
private int balance;


Account(){}
Account(String accountOwner){
	this.accountOwner=accountOwner;
	balance=0;
			
}

public void deposit(int amount) {          //�Ա��� �׼� ���;���
	balance+=amount;					   //balance�� �Ա��� �׼���ŭ �þ
										   // �ǵ��� �ִ°� ���� void
}
public int withdraw(int amount) {		  //����� �׼� 
	if(balance<amount) {
		System.out.println("�ܰ� �����մϴ�..");
		amount=0;							//�ǵ����ٰ� 0
	}else {
		balance-=amount;                   //
	}
	return amount;						 //if�� �������� �ϳ� return?
    }
public int getBalance() {
	return balance;
	
}
public String getAccountOwner() {
	return accountOwner;
}
}