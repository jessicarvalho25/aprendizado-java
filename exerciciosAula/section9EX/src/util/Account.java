package util;

public class Account {

	private Integer number;
	private Double balance;
	public String holder;

	public Account(Integer number, Double initialDeposit, String holder) {
		this.number = number;
		this.balance = initialDeposit;
		this.holder = holder;
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
		balance = 0.0;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double value) {

		balance += value;
	}
	
	public void withdraw (Double value) {
		balance -= value + 5;
		
	}
	
	public String toString () {
		return "Account: " 
				+ number
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
		
	}
}
