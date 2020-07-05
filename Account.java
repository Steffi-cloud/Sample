package com.example.demo.model;

import java.util.Date;

public class Account {
private String accountHolderName;
private  String customerId;
private String accountBalance;
private String accountNumber;
private String bankIfscCode;
private Date transactionDate;
private String debitedAmount;
private String creditedAmount;
public Account(String accountHolderName, String customerId, String accountBalance,String accountNumber, String bankIfscCode,
		Date transactionDate, String debitedAmount, String creditedAmount) {
	super();
	this.accountHolderName = accountHolderName;
	this.customerId = customerId;
	this.accountBalance = accountBalance;
	this.bankIfscCode = bankIfscCode;
	this.transactionDate = transactionDate;
	this.debitedAmount = debitedAmount;
	this.creditedAmount = creditedAmount;
	this.accountNumber=accountNumber;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(String accountBalance) {
	this.accountBalance = accountBalance;
}
public String getBankIfscCode() {
	return bankIfscCode;
}
public void setBankIfscCode(String bankIfscCode) {
	this.bankIfscCode = bankIfscCode;
}
public Date getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}
public String getDebitedAmount() {
	return debitedAmount;
}
public void setDebitedAmount(String debitedAmount) {
	this.debitedAmount = debitedAmount;
}
public String getCreditedAmount() {
	return creditedAmount;
}
public void setCreditedAmount(String creditedAmount) {
	this.creditedAmount = creditedAmount;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}


}
