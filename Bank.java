package com.example.demo.model;

public class Bank {

	private String bankName;
	private String ifscCode;

	private String accountNumber;
	private String accountBalance;

	public Bank(String bankName, String ifscCode, String accountNumber, String accountBalance) {
		super();
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
}
