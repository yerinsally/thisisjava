package ch06.problem;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    private int money;
    
    //필요한 메소드 작성 
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    public void deposit(int balance) {
    	money += balance;
    }
    public void withdraw(int balance) {
    	if(money < balance) {
    		System.out.println("한도 초과");
    	}else {
        	money -= balance;
    	}
    }
    public void showBalance() {
    	System.out.print(money);
    }
}
