package ch18;

public class Account {
	private String time;
	private int inMoney;
	private int outMoney;
	private int money;

	public Account(String time, int inMoney, int outMoney, int money) {
		this.time = time;
		this.inMoney = inMoney;
		this.outMoney = outMoney;
		this.money = money;
	}	

	public String getDate() {
		return time;
	}

	public int getOutMoney() {
		return outMoney;
	}

	public int getInMoney() {
		return inMoney;
	}

	public int getMoney() {
		return money;
	}

	public void showMoney() {
		System.out.println(money);
	}
}

