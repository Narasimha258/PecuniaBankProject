package com.cg.pecuniabank.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountDetails {
	

	@Id
	@Column(name="Account_number")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="genName1")
	@SequenceGenerator(name="genName1", sequenceName="acc",initialValue=1170000011,allocationSize=1)
	private long accountNumber;

	@OneToOne(cascade=CascadeType.ALL)   
	@JoinColumn(name="Customer_ID")
	CustomerDetails customerDetails;
	
	@Column(name="Account_Holder_Name")
	private String accountHolderName;
	
	@Column(name="Account_Status")
	private String accountStatus;
	
	@Column(name="Account_Balance")
	private double accountBalance;
	
	@Column(name="Account_Interest")
	private float accountInterest;
	
	@Column(name="Opening_Date")
	private LocalDateTime openingDate;	
	
    @ManyToOne(optional = false)
	@JoinColumn(name="Branch_Id") //According the customer location the branch is assigned.
	BranchDetails branchdetails;
    
    public AccountDetails()
    {
    	super();
    }

	public AccountDetails(long accountNumber, CustomerDetails customerDetails, String accountHolderName,
			String accountStatus, double accountBalance, float accountInterest,
			LocalDateTime openingDate, BranchDetails branchdetails) {
		super();
		this.customerDetails = customerDetails;
		this.accountHolderName = accountHolderName;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountInterest = accountInterest;
		this.openingDate = openingDate;
		this.branchdetails = branchdetails;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public float getAccountInterest() {
		return accountInterest;
	}

	public void setAccountInterest(float accountInterest) {
		this.accountInterest = accountInterest;
	}

	public LocalDateTime getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDateTime openingDate) {
		this.openingDate = openingDate;
	}

	public BranchDetails getBranchdetails() {
		return branchdetails;
	}

	public void setBranchdetails(BranchDetails branchdetails) {
		this.branchdetails = branchdetails;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", customerDetails=" + customerDetails
				+ ", accountHolderName=" + accountHolderName + ", accountStatus=" + accountStatus + ", accountBalance="
				+ accountBalance + ",  accountInterest=" + accountInterest
				+ ", openingDate=" + openingDate + ", branchdetails=" + branchdetails + "]";
	}

	
}

