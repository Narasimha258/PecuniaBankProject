package com.cg.pecuniabank.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="genName5")
	@SequenceGenerator(name="genName5", sequenceName="id5",initialValue=101101,allocationSize=1)
	@Column(name="Transaction_Id")
	private long transactionId;
		
	@Column(name="Account_Number")
	private long accountNumber;
	
	@Column(name="Transaction_Option")//slip or cheque
	private String transactionOption;
		
	@Column(name="Transaction_Type")//credit debit
	private	String transactionType;
		
	@Column(name="Transaction_Status")
	private	String transactionStatus;
		
	@Column(name="Transaction_Amount")
	private	String transactionAmount;
		
	@Column(name="Transaction_Date")
	LocalDateTime transactionDate;
		
	@Column(name="Benificary_Name")
	private	String benificaryName;
		
	@Column(name="Benificary_Accoount_Number")
	private String benificaryAccoountNumber;
		
	@Column(name="Benificary_Bank_Name")
	private	String bankName;
	
	public Transaction()
	{
		
	}
		
	public Transaction(long accountNumber, String transactionOption, String transactionType,
			String transactionStatus, String transactionAmount, LocalDateTime transactionDate, String benificaryName,
			String benificaryAccoountNumber, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.transactionOption = transactionOption;
		this.transactionType = transactionType;
		this.transactionStatus = transactionStatus;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.benificaryName = benificaryName;
		this.benificaryAccoountNumber = benificaryAccoountNumber;
		this.bankName = bankName;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTransactionOption() {
		return transactionOption;
	}

	public void setTransactionOption(String transactionOption) {
		this.transactionOption = transactionOption;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getBenificaryName() {
		return benificaryName;
	}

	public void setBenificaryName(String benificaryName) {
		this.benificaryName = benificaryName;
	}

	public String getBenificaryAccoountNumber() {
		return benificaryAccoountNumber;
	}

	public void setBenificaryAccoountNumber(String benificaryAccoountNumber) {
		this.benificaryAccoountNumber = benificaryAccoountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}

