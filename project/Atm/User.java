package com.project.Atm;

public class User {

	private long id;
	private String name;
	private double amount;
	private String accountnumber;
	private int pin;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public User(long id, String name, double amount, String accountnumber, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.accountnumber = accountnumber;
		this.pin = pin;
	}
	
	
	
}
