package com.cg.pecuniabank;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.pecuniabank.entity.AccountDetails;
import com.cg.pecuniabank.entity.AddressDetails;
import com.cg.pecuniabank.entity.BranchDetails;
import com.cg.pecuniabank.entity.CustomerDetails;
import com.cg.pecuniabank.entity.Transaction;
import com.cg.pecuniabank.service.PassbookService;



@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	PassbookService service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		BranchDetails branchDetails1 = new BranchDetails();
		AddressDetails address1 = new AddressDetails();
		address1.setCity("PHAGWARA");
		address1.setStreet("UNI MALL,LPU");
		address1.setState("PUNJAB");
		address1.setZipCode("144401");
		branchDetails1.setBranchName("LPU PECUNIA");
		branchDetails1.setPhoneNumber("2201");
		branchDetails1.setAddress(address1);
		branchDetails1.setBranchIFSC("PUNB033950");

		BranchDetails branchDetails2 = new BranchDetails();
		AddressDetails address2 = new AddressDetails();
		address2.setCity("KANPUR");
		address2.setStreet("RAJA PARK");
		address2.setState("UP");
		address2.setZipCode("815520");
		branchDetails2.setBranchName("KANPUR PECUNIA");
		branchDetails2.setPhoneNumber("2202");
		branchDetails2.setAddress(address2);
		branchDetails2.setBranchIFSC("PUNB033951");

		BranchDetails branchDetails3 = new BranchDetails();
		AddressDetails address3 = new AddressDetails();
		address3.setCity("JAIPUR");
		address3.setStreet("GHANTA GHAR");
		address3.setState("RAJASTHAN");
		address3.setZipCode("808124");
		branchDetails3.setBranchName("JAIPUR PECUNIA");
		branchDetails3.setPhoneNumber("2203");
		branchDetails3.setAddress(address3);
		branchDetails3.setBranchIFSC("PUNB033952");

		BranchDetails branchDetails4 = new BranchDetails();
		AddressDetails address4 = new AddressDetails();
		address4.setCity("SAHARSA");
		address4.setStreet("GANGJALA");
		address4.setState("BIHAR");
		address4.setZipCode("852201");
		branchDetails4.setBranchName("SAHARSA PECUNIA");
		branchDetails4.setPhoneNumber("2204");
		branchDetails4.setAddress(address4);
		branchDetails4.setBranchIFSC("PUNB033953");

		BranchDetails branchDetails5 = new BranchDetails();
		AddressDetails address5 = new AddressDetails();
		address5.setCity("NEW DELHI");
		address5.setStreet("RAJIV CHOWK");
		address5.setState("NEW DELHI");
		address5.setZipCode("141101");
		branchDetails5.setBranchName("DELHI PECUNIA");
		branchDetails5.setPhoneNumber("2205");
		branchDetails5.setAddress(address5);
		branchDetails5.setBranchIFSC("PUNB033954");

		service.insertBranchDetails(branchDetails1);
		service.insertBranchDetails(branchDetails2);
		service.insertBranchDetails(branchDetails3);
		service.insertBranchDetails(branchDetails4);
		service.insertBranchDetails(branchDetails5);

		// Account Details...

		//Account 1
		AccountDetails accountDetails1=new AccountDetails();
		AddressDetails customer1Address=new AddressDetails();
		CustomerDetails customerDetails1=new CustomerDetails();

		
		customerDetails1.setCustomerFirstName("Vaishali");
		customerDetails1.setCustomerLastName("Tiwari");
		customerDetails1.setDOB("07/07/1998");
		customerDetails1.setAge("21");
		customerDetails1.setGender("Female");
		customerDetails1.setContactNumber("9815406012");
		customerDetails1.setPanNumber("QSWED234M");
		customerDetails1.setAdhaarNumber("3650 7451 9856");
		customerDetails1.setAccountType("Current");
		customerDetails1.setOpeningBalance(25000);
		customerDetails1.setBranchId(branchDetails1.getBranchId());
		customer1Address.setStreet("127/211 W-2 Juhi Kalan");
		customer1Address.setState("UP");
		customer1Address.setCity("Kanpur");
		customer1Address.setZipCode("208027");
		customerDetails1.setAddress(customer1Address);
		accountDetails1.setCustomerDetails(customerDetails1);
		accountDetails1.setAccountHolderName("Vaishali Tiwari");
		accountDetails1.setAccountStatus("Active");
		accountDetails1.setAccountBalance(25000);
		customerDetails1.setCreditScore(1400);
		accountDetails1.setAccountInterest(3);
		accountDetails1.setOpeningDate(LocalDateTime.now());
	    accountDetails1.setBranchdetails(branchDetails1);

		
	//Account 2
	
	AccountDetails accountDetails2=new AccountDetails();
	AddressDetails customer2Address=new AddressDetails();
	CustomerDetails customerDetails2=new CustomerDetails();

		accountDetails2.setAccountHolderName("Ashish Singh");
		accountDetails2.setAccountInterest((float) 3.5);
		customerDetails2.setCreditScore(980);
		accountDetails2.setAccountBalance(12000);
		accountDetails2.setAccountStatus("Active");
	    accountDetails2.setBranchdetails(branchDetails1);
	    accountDetails2.setOpeningDate(LocalDateTime.now());
	    customerDetails2.setBranchId(branchDetails1.getBranchId());
		customerDetails2.setOpeningBalance(12000);
		customerDetails2.setAccountType("Savings");
		customerDetails2.setAdhaarNumber("7485 8555 3330");
		customerDetails2.setContactNumber("9041459865");
		customerDetails2.setPanNumber("RTYUO852L");
	    customerDetails2.setDOB("06/02/1998");
	    customerDetails2.setCustomerFirstName("Ashish");
		customerDetails2.setCustomerLastName("Singh");
		customerDetails2.setAge("22");
		customerDetails2.setGender("Male");
		customer2Address.setStreet("58,Govindpura");
		customer2Address.setState("New Delhi");
		customer2Address.setCity("New Delhi");
		customer2Address.setZipCode("110011");
		customerDetails2.setAddress(customer2Address);
		accountDetails2.setCustomerDetails(customerDetails2);

		//Account 3
		AccountDetails accountDetails3=new AccountDetails();
		AddressDetails customer3Address=new AddressDetails();
		CustomerDetails customerDetails3=new CustomerDetails();

		accountDetails3.setAccountHolderName("Vishal Tiwari");
		accountDetails3.setAccountInterest((float) 3.5);
		customerDetails3.setCreditScore(500);
		accountDetails3.setAccountBalance(6000);
		accountDetails3.setAccountStatus("Active");
		accountDetails3.setBranchdetails(branchDetails2);
		accountDetails3.setOpeningDate(LocalDateTime.now());
		
		customerDetails3.setBranchId(branchDetails2.getBranchId());
		customerDetails3.setOpeningBalance(6000);
		customerDetails3.setAccountType("Savings");
		customerDetails3.setAdhaarNumber("9652 2222 6000");
		customerDetails3.setContactNumber("7007820982");
		customerDetails3.setPanNumber("AATRE747P");
		customerDetails3.setDOB("23/10/1994");
		customerDetails3.setCustomerFirstName("Vishal");
		customerDetails3.setCustomerLastName("Tiwari");
		customerDetails3.setAge("26");
		customerDetails3.setGender("Male");
		customer3Address.setStreet("718,Collector Ganj");
		customer3Address.setState("UP");
		customer3Address.setCity("Unnao");
		customer3Address.setZipCode("209801");
		customerDetails3.setAddress(customer3Address);
		accountDetails3.setCustomerDetails(customerDetails3);
	
		
//Account 4
		
		AccountDetails accountDetails4=new AccountDetails();
		AddressDetails customer4Address=new AddressDetails();
		CustomerDetails customerDetails4=new CustomerDetails();

		accountDetails4.setAccountHolderName("Mradula Shukla");
		accountDetails4.setAccountInterest(3);
		customerDetails4.setCreditScore(905);
		accountDetails4.setAccountBalance(8500);
		accountDetails4.setAccountStatus("Active");
		accountDetails4.setBranchdetails(branchDetails2);
		accountDetails4.setOpeningDate(LocalDateTime.now());
		customerDetails4.setBranchId(branchDetails2.getBranchId());
		customerDetails4.setOpeningBalance(8500);
		customerDetails4.setAccountType("Current");
		customerDetails4.setAdhaarNumber("9854 4569 2345");
		customerDetails4.setContactNumber("8004255984");
		customerDetails4.setPanNumber("YTRFV664L");
		customerDetails4.setDOB("21/06/1994");
		customerDetails4.setCustomerFirstName("Mradula");
		customerDetails4.setCustomerLastName("Shukla");
		customerDetails4.setAge("44");
		customerDetails4.setGender("Female");
		customer4Address.setStreet("126,Sector-11");
		customer4Address.setState("Gujrat");
		customer4Address.setCity("Gandhi Nagar");
		customer4Address.setZipCode("362011");
		customerDetails4.setAddress(customer4Address);
		accountDetails4.setCustomerDetails(customerDetails4);
		customerDetails4.setAddress(customer4Address);
		accountDetails4.setCustomerDetails(customerDetails4);

		//Account5
		AccountDetails accountDetails5=new AccountDetails();
		AddressDetails customer5Address=new AddressDetails();
		CustomerDetails customerDetails5=new CustomerDetails();

		accountDetails5.setAccountHolderName("Anushkaa Awasthi");
		accountDetails5.setAccountInterest(3);
		customerDetails5.setCreditScore(700);
		accountDetails5.setAccountBalance(9700);
		accountDetails5.setAccountStatus("Active");
		accountDetails5.setBranchdetails(branchDetails3);
		customerDetails5.setBranchId(branchDetails3.getBranchId());
		customerDetails5.setOpeningBalance(9700);
		customerDetails5.setAccountType("Current");
		customerDetails5.setAdhaarNumber("7458 5464 2545");
		customerDetails5.setContactNumber("8317016118");
		customerDetails5.setPanNumber("QCFRE856F");
		customerDetails5.setDOB("06/04/1989");
		customerDetails5.setCustomerFirstName("Anushkaa");
		customerDetails5.setCustomerLastName("Awasthi");
		customerDetails5.setAge("31");
		customerDetails5.setGender("Female");
		customer5Address.setStreet("2-9-2,Arihant Majestiv Towers");
		customer5Address.setState("Tamil Nadu");
		customer5Address.setCity("Chennai");
		customer5Address.setZipCode("600107");
		accountDetails5.setOpeningDate(LocalDateTime.now());
		customerDetails5.setAddress(customer5Address);
		accountDetails5.setCustomerDetails(customerDetails5);
		customerDetails5.setAddress(customer5Address);
		accountDetails5.setCustomerDetails(customerDetails5);

		//Account6
		
		AccountDetails accountDetails6=new AccountDetails();
		AddressDetails customer6Address=new AddressDetails();
		CustomerDetails customerDetails6=new CustomerDetails();
		accountDetails6.setAccountHolderName("Prabhjot");
		accountDetails6.setAccountInterest(3);
		customerDetails6.setCreditScore(1250);
		accountDetails6.setAccountBalance(5000);
		accountDetails6.setAccountStatus("Active");
		accountDetails6.setBranchdetails(branchDetails3);
		customerDetails6.setOpeningBalance(5000);
		customerDetails6.setAccountType("Current");
		customerDetails6.setAdhaarNumber("9656 4565 2421");
		customerDetails6.setContactNumber("8968117732");
		customerDetails6.setPanNumber("TYRFD567P");
		customerDetails6.setDOB("05/03/1997");
		customerDetails6.setCustomerFirstName("Prabhjot");
		customerDetails6.setCustomerLastName("Kaur");
		customerDetails6.setAge("23");
		accountDetails6.setOpeningDate(LocalDateTime.now());
		customerDetails6.setGender("Female");
		customer6Address.setStreet("900,Bhagat Singh Nagar Model House");
		customer6Address.setState("Punjab");
		customer6Address.setCity("Jalandhar");
		customer6Address.setZipCode("144003");
		customerDetails6.setAddress(customer6Address);
		accountDetails6.setCustomerDetails(customerDetails6);
		customerDetails6.setAddress(customer6Address);
		accountDetails6.setCustomerDetails(customerDetails6);
		customerDetails6.setBranchId(branchDetails3.getBranchId());
		
		//Account 7
		AccountDetails accountDetails7=new AccountDetails();
		AddressDetails customer7Address=new AddressDetails();
		CustomerDetails customerDetails7=new CustomerDetails();
		accountDetails7.setAccountHolderName("Rahul Bajaj");
		accountDetails7.setAccountInterest((float) 3.5);
		customerDetails7.setCreditScore(2200);
		accountDetails7.setAccountBalance(7500);
		accountDetails7.setAccountStatus("Active");
		accountDetails7.setBranchdetails(branchDetails3);
		customerDetails7.setOpeningBalance(7500);
		customerDetails7.setBranchId(branchDetails3.getBranchId());
		customerDetails7.setAccountType("Savings");
		customerDetails7.setAdhaarNumber("7546 8598 2115");
		customerDetails7.setContactNumber("9415546297");
		customerDetails7.setPanNumber("ASWED099D");
		customerDetails7.setDOB("04/12/1978");
		customerDetails7.setCustomerFirstName("Rahul");
		customerDetails7.setCustomerLastName("Bajaj");
		customerDetails7.setAge("42");
		customerDetails7.setGender("Male");
		accountDetails7.setOpeningDate(LocalDateTime.now());
		customer7Address.setStreet("101 Circular Rd, Bemloi");
		customer7Address.setState("Himachal Pradesh");
		customer7Address.setCity("Shimla");
		customer7Address.setZipCode("171001");
		customerDetails7.setAddress(customer7Address);
		accountDetails7.setCustomerDetails(customerDetails7);
		customerDetails7.setAddress(customer7Address);
		accountDetails7.setCustomerDetails(customerDetails7);

		//Account 8
		
		AccountDetails accountDetails8=new AccountDetails();
		AddressDetails customer8Address=new AddressDetails();
		CustomerDetails customerDetails8=new CustomerDetails();
		accountDetails8.setAccountHolderName("Amardeep Singh");
		accountDetails8.setAccountInterest((float)3);
		accountDetails8.setAccountBalance(9000);
		accountDetails8.setAccountStatus("Active");
		accountDetails8.setOpeningDate(LocalDateTime.now());
		accountDetails8.setBranchdetails(branchDetails3);
		customerDetails8.setOpeningBalance(9000);
		customerDetails8.setAccountType("Current");
		customerDetails8.setAdhaarNumber("4829 5542 8768");
		customerDetails8.setContactNumber("8840864659");
		customerDetails8.setPanNumber("PYGTF4267P");
		customerDetails8.setDOB("03/05/1990");
		customerDetails8.setCustomerFirstName("Amardeep");
		customerDetails8.setCustomerLastName("Singh");
		customerDetails8.setAge("30");
		customerDetails8.setCreditScore(300);
		customerDetails8.setBranchId(branchDetails3.getBranchId());
		customerDetails8.setGender("Male");
		customer8Address.setStreet("Gujela, Ghatampur");
		customer8Address.setState("Uttar Pradesh");
		customer8Address.setCity("Kanpur");
		customer8Address.setZipCode("209206");
		customerDetails8.setAddress(customer8Address);
		accountDetails8.setCustomerDetails(customerDetails8);
		customerDetails8.setAddress(customer8Address);
		accountDetails8.setCustomerDetails(customerDetails8);
		      
		//Account 9
		
		AccountDetails accountDetails9=new AccountDetails();
		AddressDetails customer9Address=new AddressDetails();
		CustomerDetails customerDetails9=new CustomerDetails();
		accountDetails9.setAccountHolderName("Satyam Sinha");
		accountDetails9.setAccountInterest((float)3.5);
		customerDetails9.setCreditScore(1610);
		accountDetails9.setAccountBalance(20000);
		accountDetails9.setAccountStatus("Active");
		accountDetails9.setOpeningDate(LocalDateTime.now());
		accountDetails9.setBranchdetails(branchDetails2);
		customerDetails9.setOpeningBalance(20000);
		customerDetails9.setAccountType("Savings");
		customerDetails9.setAdhaarNumber("6985 2345 6528");
		customerDetails9.setContactNumber("9973060640");
		customerDetails9.setPanNumber("BSTUM8165M");
		customerDetails9.setDOB("02/04/1984");
		customerDetails9.setCustomerFirstName("Satyam");
		customerDetails9.setCustomerLastName("Sinha");
		customerDetails9.setAge("36");
		customerDetails9.setGender("Male");
		customerDetails9.setBranchId(branchDetails2.getBranchId());
		customer9Address.setStreet("East off Bustand, Gangjala");
		customer9Address.setState("Bihar");
		customer9Address.setCity("Saharasa");
		customer9Address.setZipCode("855201");
		customerDetails9.setAddress(customer9Address);
		accountDetails9.setCustomerDetails(customerDetails9);
		customerDetails9.setAddress(customer9Address);
		accountDetails9.setCustomerDetails(customerDetails9);		
				
		//Account 10
		
		AccountDetails accountDetails10=new AccountDetails();
		AddressDetails customer10Address=new AddressDetails();
		CustomerDetails customerDetails10=new CustomerDetails();
		accountDetails10.setAccountHolderName("Pranav Kapoor");
		accountDetails10.setAccountInterest((float)3.5);
		customerDetails10.setCreditScore(1980);
		accountDetails10.setAccountBalance(5600);
		accountDetails10.setAccountStatus("Active");
		accountDetails10.setOpeningDate(LocalDateTime.now());
		accountDetails10.setBranchdetails(branchDetails5);
		customerDetails10.setOpeningBalance(5600);
		customerDetails10.setAccountType("Savings");
		customerDetails10.setAdhaarNumber("5298 1114 8262");
		customerDetails10.setContactNumber("9115513073");
		customerDetails10.setPanNumber("APMUT4815B");
		customerDetails10.setDOB("03/10/1992");
		customerDetails10.setCustomerFirstName("Pranav");
		customerDetails10.setCustomerLastName("Kapoor");
		customerDetails10.setAge("28");
		customerDetails10.setGender("Male");
		customerDetails10.setBranchId(branchDetails5.getBranchId());
		customer10Address.setStreet("Near Ashram Marg, Jawahar Circle");
		customer10Address.setState("Rajasthan");
		customer10Address.setCity("Jaipur");
		customer10Address.setZipCode("302015");
		customerDetails10.setAddress(customer10Address);
		accountDetails10.setCustomerDetails(customerDetails10);
		customerDetails10.setAddress(customer10Address);
		accountDetails10.setCustomerDetails(customerDetails10);
		
		//Account 11
		
		AccountDetails accountDetails11 = new AccountDetails();                
		AddressDetails customer11Address = new AddressDetails();
		CustomerDetails customerDetails11 = new CustomerDetails();
		accountDetails11.setAccountHolderName("Abhay Sonkhla");
		accountDetails11.setAccountInterest((float)3.5);
		customerDetails11.setCreditScore(1700);
		accountDetails11.setAccountBalance(7000);
		accountDetails11.setAccountStatus("Active");
		accountDetails11.setOpeningDate(LocalDateTime.now());
		accountDetails11.setBranchdetails(branchDetails4);
		customerDetails11.setOpeningBalance(7000);
		customerDetails11.setAccountType("Savings");
		customerDetails11.setAdhaarNumber("4444 2222 7878");
		customerDetails11.setContactNumber("9882522687");
		customerDetails11.setPanNumber("AHSGI7857F");
		customerDetails11.setDOB("19/05/1998");
		customerDetails11.setCustomerFirstName("Abhay");
		customerDetails11.setCustomerLastName("Sonkhla");
		customerDetails11.setAge("21");
		customerDetails11.setGender("Male");
		customerDetails11.setBranchId(branchDetails4.getBranchId());
		customer11Address.setStreet("529,PWD Colony Near Lohna Estate");
		customer11Address.setState("Himachal Pardesh");
		customer11Address.setCity("Palampur");
		customer11Address.setZipCode("170091");
		customerDetails11.setAddress(customer11Address);
		accountDetails11.setCustomerDetails(customerDetails11);
		
//      Account 12

		AccountDetails accountDetails12 = new AccountDetails();
		AddressDetails customer12Address = new AddressDetails();
		CustomerDetails customerDetails12 = new CustomerDetails();
		accountDetails12.setAccountHolderName("Sujey Singh");
		accountDetails12.setAccountInterest((float)3);
		customerDetails12.setCreditScore(718);
		accountDetails12.setAccountBalance(5000);
		accountDetails12.setAccountStatus("Active");
		accountDetails12.setOpeningDate(LocalDateTime.now());
		accountDetails12.setBranchdetails(branchDetails4);
		customerDetails12.setOpeningBalance(5000);
		customerDetails12.setAccountType("Current");
		customerDetails12.setAdhaarNumber("7899 8123 76262");
		customerDetails12.setContactNumber("7389881849");
		customerDetails12.setPanNumber("PJKLQ7567D");
		customerDetails12.setDOB("19/09/1997");
		customerDetails12.setCustomerFirstName("Sujey");
		customerDetails12.setCustomerLastName("Singh");
		customerDetails12.setAge("22");
		customerDetails12.setGender("Male");
		customerDetails12.setBranchId(branchDetails4.getBranchId());
		customer12Address.setStreet("423,Ghai Nagar Colony");
		customer12Address.setState("Madhya Pardesh");
		customer12Address.setCity("Bhopal");
		customer12Address.setZipCode("140038");
		customerDetails12.setAddress(customer12Address);
		accountDetails12.setCustomerDetails(customerDetails12);

		//Account 13
		
		AccountDetails accountDetails13 = new AccountDetails();
		AddressDetails customer13Address = new AddressDetails();
		CustomerDetails customerDetails13 = new CustomerDetails();
		accountDetails13.setAccountHolderName("Dripti Sinha");
		accountDetails13.setAccountInterest((float)3.5);
		customerDetails13.setCreditScore(800);
		accountDetails13.setAccountBalance(8000);
		accountDetails13.setAccountStatus("Active");
		accountDetails13.setOpeningDate(LocalDateTime.now());
		accountDetails13.setBranchdetails(branchDetails4);
		customerDetails13.setOpeningBalance(8000);
		customerDetails13.setAccountType("Savings");
		customerDetails13.setAdhaarNumber("4513 7868 9911");
		customerDetails13.setContactNumber("9814098995");
		customerDetails13.setPanNumber("KILAK6501W");
		customerDetails13.setDOB("23/06/1998");
		customerDetails13.setCustomerFirstName("Dripti");
		customerDetails13.setCustomerLastName("Sinha");
		customerDetails13.setAge("21");
		customerDetails13.setGender("Female");
		customerDetails13.setBranchId(branchDetails4.getBranchId());
		customer13Address.setStreet("989,G.T.B Nagar Road");
		customer13Address.setState("Punjab");
		customer13Address.setCity("Jalandhar");
		customer13Address.setZipCode("140001");
		customerDetails13.setAddress(customer13Address);
		accountDetails13.setCustomerDetails(customerDetails13);
       
		//Account 14
		
		AccountDetails accountDetails14 = new AccountDetails();
		AddressDetails customer14Address = new AddressDetails();
		CustomerDetails customerDetails14 = new CustomerDetails();
		accountDetails14.setAccountHolderName("Renu Huria");
		accountDetails14.setAccountInterest((float)3);
		customerDetails14.setCreditScore(1200);
		accountDetails14.setAccountBalance(8500);
		accountDetails14.setAccountStatus("Active");
		accountDetails14.setOpeningDate(LocalDateTime.now());
		accountDetails14.setBranchdetails(branchDetails2);

		customerDetails14.setOpeningBalance(8500);
		customerDetails14.setAccountType("Current");
		customerDetails14.setAdhaarNumber("5423 0099 6677");
		customerDetails14.setContactNumber("7896541326");
		customerDetails14.setPanNumber("POJSH5765J");
		customerDetails14.setDOB("03/06/1998");
		customerDetails14.setCustomerFirstName("Renu");
		customerDetails14.setCustomerLastName("Huria");
		customerDetails14.setAge("21");
		customerDetails14.setGender("Female");
		customerDetails14.setBranchId(branchDetails2.getBranchId());
		customer14Address.setStreet("514,New Kartar Colony Model Town");
		customer14Address.setState("Punjab");
		customer14Address.setCity("Jalandhar");
		customer14Address.setZipCode("140008");
		customerDetails14.setAddress(customer14Address);
		accountDetails14.setCustomerDetails(customerDetails14);
        
		//Account 15
		
		AccountDetails accountDetails15 = new AccountDetails();
		AddressDetails customer15Address = new AddressDetails();
		CustomerDetails customerDetails15 = new CustomerDetails();
		accountDetails15.setAccountHolderName("Manoj Kumar Meena");
		accountDetails15.setAccountInterest((float)3.5);
		customerDetails15.setCreditScore(1000);
		accountDetails15.setAccountBalance(5000);
		accountDetails15.setAccountStatus("Active");
		accountDetails15.setOpeningDate(LocalDateTime.now());
		accountDetails15.setBranchdetails(branchDetails1);

		customerDetails15.setOpeningBalance(5000);
		customerDetails15.setAccountType("Savings");
		customerDetails15.setAdhaarNumber("5141 9823  6151");
		customerDetails15.setContactNumber("8146409991");
		customerDetails15.setPanNumber("AHKLG7605J");
		customerDetails15.setDOB("05/05/1998");
		customerDetails15.setCustomerFirstName("Manoj Kumar");
		customerDetails15.setCustomerLastName("Meena");
		customerDetails15.setAge("21");
		customerDetails15.setGender("Male");
		customerDetails15.setBranchId(branchDetails1.getBranchId());
		customer15Address.setStreet("152,Zinc Colony Hurda");
		customer15Address.setState("Rajasthan");
		customer15Address.setCity("Bhilwara");
		customer15Address.setZipCode("311002");
		customerDetails15.setAddress(customer15Address);
		accountDetails15.setCustomerDetails(customerDetails15);

		//Account 16
		
		AccountDetails accountDetails16 = new AccountDetails();
		AddressDetails customer16Address = new AddressDetails();
		CustomerDetails customerDetails16 = new CustomerDetails();
		accountDetails16.setAccountHolderName("Anjali Singh");
		accountDetails16.setAccountInterest((float)3.5);
		customerDetails16.setCreditScore(800);
		accountDetails16.setAccountBalance(7500);
		accountDetails16.setAccountStatus("Active");
		accountDetails16.setOpeningDate(LocalDateTime.now());
		accountDetails16.setBranchdetails(branchDetails5);

		customerDetails16.setOpeningBalance(7500);
		customerDetails16.setAccountType("Savings");
		customerDetails16.setAdhaarNumber("6667 8768 9142");
		customerDetails16.setContactNumber("8210123908");
		customerDetails16.setPanNumber("TVBGA8376Y");
		customerDetails16.setDOB("23/06/1997");
		customerDetails16.setCustomerFirstName("Anjali");
		customerDetails16.setCustomerLastName("Singh");
		customerDetails16.setAge("22");
		customerDetails16.setGender("Female");
		customerDetails16.setBranchId(branchDetails5.getBranchId());
		customer16Address.setStreet("55,Shastri Market Road");
		customer16Address.setState("Bihar");
		customer16Address.setCity("Dhanbaad");
		customer16Address.setZipCode("100451");
		customerDetails16.setAddress(customer16Address);
		accountDetails16.setCustomerDetails(customerDetails16);
		
		//Account 17

		AccountDetails accountDetails17 = new AccountDetails();
		AddressDetails customer17Address = new AddressDetails();
		CustomerDetails customerDetails17 = new CustomerDetails();
		accountDetails17.setAccountHolderName("Ayush Chaudhary");
		accountDetails17.setAccountInterest((float)3);
		customerDetails17.setCreditScore(450);
		accountDetails17.setAccountBalance(6000);
		accountDetails17.setAccountStatus("Active");
		accountDetails17.setOpeningDate(LocalDateTime.now());
		accountDetails17.setBranchdetails(branchDetails4);

		customerDetails17.setOpeningBalance(6000);
		customerDetails17.setAccountType("Current");
		customerDetails17.setAdhaarNumber("8918 8171 8181");
		customerDetails17.setContactNumber("9557102414");
		customerDetails17.setPanNumber("TREHA8786Y");
		customerDetails17.setDOB("06/06/1997");
		customerDetails17.setCustomerFirstName("Ayush");
		customerDetails17.setCustomerLastName("Chaudhary");
		customerDetails17.setAge("22");
		customerDetails17.setGender("Male");
		customerDetails17.setBranchId(branchDetails4.getBranchId());
		customer17Address.setStreet("613,Austin Town Market");
		customer17Address.setState("Uttar Pradesht");
		customer17Address.setCity("Meerut");
		customer17Address.setZipCode("144001");
		customerDetails17.setAddress(customer17Address);
		accountDetails17.setCustomerDetails(customerDetails17);
		
		//Account 18
		
		AccountDetails accountDetails18 = new AccountDetails();
		AddressDetails customer18Address = new AddressDetails();
		CustomerDetails customerDetails18 = new CustomerDetails();
		accountDetails18.setAccountHolderName("Praveen Chaturvedi");
		accountDetails18.setAccountInterest((float)3.5);
		customerDetails18.setCreditScore(1500);
		accountDetails18.setAccountBalance(60000);
		accountDetails18.setAccountStatus("Active");
		accountDetails18.setOpeningDate(LocalDateTime.now());
		accountDetails18.setBranchdetails(branchDetails5);

		customerDetails18.setOpeningBalance(60000);
		customerDetails18.setAccountType("Savings");
		customerDetails18.setAdhaarNumber("8198 1785 2020");
		customerDetails18.setContactNumber("8004285698");
		customerDetails18.setPanNumber("HWTUY3440L");
		customerDetails18.setDOB("21/08/1958");
		customerDetails18.setCustomerFirstName("Praveen");
		customerDetails18.setCustomerLastName("Chaturvedi");
		customerDetails18.setAge("52");
		customerDetails18.setGender("Male");
		customerDetails18.setBranchId(branchDetails5.getBranchId());
		customer18Address.setStreet("6-1-2 Shivaji Building");
		customer18Address.setState("Karnataka");
		customer18Address.setCity("Banglore");
		customer18Address.setZipCode("462310");
		customerDetails18.setAddress(customer18Address);
		accountDetails18.setCustomerDetails(customerDetails18);
		
		//Account 19
		
		AccountDetails accountDetails19 = new AccountDetails();
		AddressDetails customer19Address = new AddressDetails();
		CustomerDetails customerDetails19 = new CustomerDetails();
		accountDetails19.setAccountHolderName("Subhadra Yadav");
		accountDetails19.setAccountInterest((float)3.5);
		customerDetails19.setCreditScore(900);
		accountDetails19.setAccountBalance(8000);
		accountDetails19.setAccountStatus("Active");
		accountDetails19.setOpeningDate(LocalDateTime.now());
		accountDetails19.setBranchdetails(branchDetails1);

		customerDetails19.setOpeningBalance(8000);
		customerDetails19.setAccountType("Savings");
		customerDetails19.setAdhaarNumber("0035 5203 1900");
		customerDetails19.setContactNumber("9458585698");
		customerDetails19.setPanNumber("WQASD0909I");
		customerDetails19.setDOB("01/12/1990");
		customerDetails19.setCustomerFirstName("Subhadra");
		customerDetails19.setCustomerLastName("Yadav");
		customerDetails19.setAge("30");
		customerDetails19.setGender("Female");
		customerDetails19.setBranchId(branchDetails1.getBranchId());
		customer19Address.setStreet("128,456 Mitali Nagar");
		customer19Address.setState("Uttar Pradesh");
		customer19Address.setCity("Mathura");
		customer19Address.setZipCode("206085");
		customerDetails19.setAddress(customer19Address);
		accountDetails19.setCustomerDetails(customerDetails19);
		
		//Account 20
		
		AccountDetails accountDetails20 = new AccountDetails();
		AddressDetails customer20Address = new AddressDetails();
		CustomerDetails customerDetails20 = new CustomerDetails();
		accountDetails20.setAccountHolderName("Abhimanyu Singh");
		accountDetails20.setAccountInterest((float)3);
		customerDetails20.setCreditScore(990);
		accountDetails20.setAccountBalance(16000);
		accountDetails20.setAccountStatus("Active");
		accountDetails20.setOpeningDate(LocalDateTime.now());
		accountDetails20.setBranchdetails(branchDetails5);

		customerDetails20.setOpeningBalance(16000);
		customerDetails20.setAccountType("Current");
		customerDetails20.setAdhaarNumber("0035 5203 1900");
		customerDetails20.setContactNumber("9839800008");
		customerDetails20.setPanNumber("BHGVF3080K");
		customerDetails20.setDOB("14/11/1993");
		customerDetails20.setCustomerFirstName("Abhimanyu");
		customerDetails20.setCustomerLastName("Singh");
		customerDetails20.setAge("27");
		customerDetails20.setGender("Male");
		customerDetails20.setBranchId(branchDetails5.getBranchId());
		customer20Address.setStreet("09,Agrasen Marg");
		customer20Address.setState("Uttar Pradesh");
		customer20Address.setCity("Kanpur");
		customer20Address.setZipCode("208068");
		customerDetails20.setAddress(customer20Address);
		accountDetails20.setCustomerDetails(customerDetails20);
		
		

						
	    service.insertAccountDetails(accountDetails1);
		service.insertAccountDetails(accountDetails2);
		service.insertAccountDetails(accountDetails3);
		service.insertAccountDetails(accountDetails4);
		service.insertAccountDetails(accountDetails5);
		service.insertAccountDetails(accountDetails6);
		service.insertAccountDetails(accountDetails7);
		service.insertAccountDetails(accountDetails8);
		service.insertAccountDetails(accountDetails9);
		service.insertAccountDetails(accountDetails10);
		service.insertAccountDetails(accountDetails11);
		service.insertAccountDetails(accountDetails12);
		service.insertAccountDetails(accountDetails13);
		service.insertAccountDetails(accountDetails14);
		service.insertAccountDetails(accountDetails15);
		service.insertAccountDetails(accountDetails16);
		service.insertAccountDetails(accountDetails17);
		service.insertAccountDetails(accountDetails18);
		service.insertAccountDetails(accountDetails19);
		service.insertAccountDetails(accountDetails20);		
		
		
		//Transaction Details...

		Transaction transaction = new Transaction();
		transaction.setAccountNumber(1170000022L);
		transaction.setBenificaryName("Kamal Roy");
		transaction.setBenificaryAccoountNumber("321456789100");
		transaction.setTransactionAmount("7000");
		transaction.setTransactionOption("Slip");
		transaction.setTransactionStatus("Success");
		transaction.setTransactionType("Credit");
		LocalDateTime transactionDate = LocalDateTime.of(2019, 03, 01, 11, 30,9);
		transaction.setTransactionDate(transactionDate);
		transaction.setBankName("SBI Bank");

		Transaction transaction1 = new Transaction();
		transaction1.setAccountNumber( 1170000022L);
		transaction1.setBenificaryName("Preeti kaur");
		transaction1.setBenificaryAccoountNumber("328799954326");
		transaction1.setTransactionAmount("8000");
		transaction1.setTransactionOption("Slip");
		transaction1.setTransactionStatus("Success");
		transaction1.setTransactionType("Credit");
		LocalDateTime transactionDate1 = LocalDateTime.of(2019, 04, 01, 12, 07, 8);

		transaction1.setTransactionDate(transactionDate1);
		transaction1.setBankName("ICIC Bank");

		Transaction transaction3 = new Transaction();
		transaction3.setAccountNumber( 1170000022L);
		transaction3.setBenificaryName("Sahil Saini");
		transaction3.setBenificaryAccoountNumber("898989876665");
		transaction3.setTransactionAmount("7000");
		transaction3.setTransactionOption("Slip");
		transaction3.setTransactionStatus("Success");
		transaction3.setTransactionType("Debit");
		LocalDateTime transactionDate3 = LocalDateTime.of(2019, 05, 12, 14, 30,07);
		transaction3.setTransactionDate(transactionDate3);
		transaction3.setBankName("SBI Bank");

		Transaction transaction4 = new Transaction();
		transaction4.setAccountNumber( 1170000022L);
		transaction4.setBenificaryName("Preeti kaur");
		transaction4.setBenificaryAccoountNumber("321456789100");
		transaction4.setTransactionAmount("2000");
		transaction4.setTransactionOption("Slip");
		transaction4.setTransactionStatus("Success");
		transaction4.setTransactionType("Debit");
		LocalDateTime transactionDate4 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction4.setTransactionDate(transactionDate4);
		transaction4.setBankName("ICIC Bank");

		Transaction transaction5 = new Transaction();
		transaction5.setAccountNumber( 1170000022L);
		transaction5.setBenificaryName("Kamal Roy");
		transaction5.setBenificaryAccoountNumber("321456789100");
		transaction5.setTransactionAmount("7000");
		transaction5.setTransactionOption("Slip");
		transaction5.setTransactionStatus("Success");
		transaction5.setTransactionType("Credit");
		LocalDateTime transactionDate5 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction5.setTransactionDate(transactionDate5);
		transaction5.setBankName("SBI Bank");
		
		
		Transaction transaction6 = new Transaction();
		transaction6.setAccountNumber( 1170000022L);
		transaction6.setBenificaryName("Sonia Kumari");
		transaction6.setBenificaryAccoountNumber("101010202020");
		transaction6.setTransactionAmount("12000");
		transaction6.setTransactionOption("Cheque");
		transaction6.setTransactionStatus("Success");
		transaction6.setTransactionType("Credit");
		LocalDateTime transactionDate6 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction6.setTransactionDate(transactionDate6);
		transaction6.setBankName("SBI Bank");
		
		
		Transaction transaction7 = new Transaction();
		transaction7.setAccountNumber( 1170000022L);
		transaction7.setBenificaryName("Navpreet Singh");
		transaction7.setBenificaryAccoountNumber("123451672635");
		transaction7.setTransactionAmount("8000");
		transaction7.setTransactionOption("Slip");
		transaction7.setTransactionStatus("Success");
		transaction7.setTransactionType("Credit");
		LocalDateTime transactionDate7 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction7.setTransactionDate(transactionDate7);
		transaction7.setBankName("SBI Bank");
		
		Transaction transaction8 = new Transaction();
		transaction8.setAccountNumber( 1170000022L);
		transaction8.setBenificaryName("Navpreet Singh");
		transaction8.setBenificaryAccoountNumber("123451672635");
		transaction8.setTransactionAmount("10000");
		transaction8.setTransactionOption("Cheque");
		transaction8.setTransactionStatus("Success");
		transaction8.setTransactionType("Credit");
		LocalDateTime transactionDate8 = LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction8.setTransactionDate(transactionDate8);
		transaction8.setBankName("SBI Bank");



		service.insertTransactionDetails(transaction);
		service.insertTransactionDetails(transaction1);
		service.insertTransactionDetails(transaction3);
		service.insertTransactionDetails(transaction4);
		service.insertTransactionDetails(transaction5);
		service.insertTransactionDetails(transaction6);
		service.insertTransactionDetails(transaction7);
		service.insertTransactionDetails(transaction8);
		
		
		
		//Transaction Details 2
		
		Transaction transaction111 = new Transaction();
		transaction111.setAccountNumber(1170000011);
		transaction111.setBenificaryName("Ritika Sharma");
		transaction111.setBenificaryAccoountNumber("111019876234");
		transaction111.setTransactionAmount("5000");
		transaction111.setTransactionOption("Slip");
		transaction111.setTransactionStatus("Success");
		transaction111.setTransactionType("Credit");
		LocalDateTime transactionDate111 = LocalDateTime.of(2019, 03, 01, 11, 30,9);
		transaction111.setTransactionDate(transactionDate111);
		transaction111.setBankName("SBI Bank");

		

		Transaction transaction112 = new Transaction();
		transaction112.setAccountNumber( 1170000011L);
		transaction112.setBenificaryName("Navjot Saini");
		transaction112.setBenificaryAccoountNumber("898989876665");
		transaction112.setTransactionAmount("7000");
		transaction112.setTransactionOption("Slip");
		transaction112.setTransactionStatus("Success");
		transaction112.setTransactionType("Debit");
		LocalDateTime transactionDate112 = LocalDateTime.of(2019, 06, 12, 14, 30,07);
		transaction112.setTransactionDate(transactionDate112);
		transaction112.setBankName("SBI Bank");

		Transaction transaction113 = new Transaction();
		transaction113.setAccountNumber( 1170000011L);
		transaction113.setBenificaryName("Preeti kaur");
		transaction113.setBenificaryAccoountNumber("321456789100");
		transaction113.setTransactionAmount("2000");
		transaction113.setTransactionOption("Slip");
		transaction113.setTransactionStatus("Success");
		transaction113.setTransactionType("Debit");
		LocalDateTime transactionDate113 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction113.setTransactionDate(transactionDate113);
		transaction113.setBankName("Oriental Bank of Commerce");

		Transaction transaction114 = new Transaction();
		transaction114.setAccountNumber( 1170000011L);
		transaction114.setBenificaryName("Anju Saini");
		transaction114.setBenificaryAccoountNumber("321456789100");
		transaction114.setTransactionAmount("7000");
		transaction114.setTransactionOption("Slip");
		transaction114.setTransactionStatus("Success");
		transaction114.setTransactionType("Credit");
		LocalDateTime transactionDate114 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction114.setTransactionDate(transactionDate114);
		transaction114.setBankName("SBI Bank");
		
		
		Transaction transaction115 = new Transaction();
		transaction115.setAccountNumber( 1170000011L);
		transaction115.setBenificaryName("Karan Singh Rajput");
		transaction115.setBenificaryAccoountNumber("101010202020");
		transaction115.setTransactionAmount("12000");
		transaction115.setTransactionOption("Cheque");
		transaction115.setTransactionStatus("Success");
		transaction115.setTransactionType("Credit");
		LocalDateTime transactionDate115 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction115.setTransactionDate(transactionDate115);
		transaction115.setBankName("SBI Bank");
		
		
		Transaction transaction116 = new Transaction();
		transaction116.setAccountNumber( 1170000011L);
		transaction116.setBenificaryName("Jaspreet kaur");
		transaction116.setBenificaryAccoountNumber("123451672635");
		transaction116.setTransactionAmount("8000");
		transaction116.setTransactionOption("Slip");
		transaction116.setTransactionStatus("Success");
		transaction116.setTransactionType("Credit");
		LocalDateTime transactionDate116 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction116.setTransactionDate(transactionDate116);
		transaction116.setBankName("SBI Bank");
		
		Transaction transaction117 = new Transaction();
		transaction117.setAccountNumber( 1170000011L);
		transaction117.setBenificaryName("Dhanujay Veinketesh");
		transaction117.setBenificaryAccoountNumber("123451672635");
		transaction117.setTransactionAmount("6500");
		transaction117.setTransactionOption("Slip");
		transaction117.setTransactionStatus("Success");
		transaction117.setTransactionType("Credit");
		LocalDateTime transactionDate117 = LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction117.setTransactionDate(transactionDate117);
		transaction117.setBankName("Oriental Bank");
		
		Transaction transaction118 = new Transaction();
		transaction118.setAccountNumber( 1170000011L);
		transaction118.setBenificaryName("Kirti Arora");
		transaction118.setBenificaryAccoountNumber("123451672635");
		transaction118.setTransactionAmount("25000");
		transaction118.setTransactionOption("Slip");
		transaction118.setTransactionStatus("Success");
		transaction118.setTransactionType("Credit");
		LocalDateTime transactionDate118= LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction118.setTransactionDate(transactionDate118);
		transaction118.setBankName("Oriental Bank");
		
		
		Transaction transaction119 = new Transaction();
		transaction119.setAccountNumber( 1170000011L);
		transaction119.setBenificaryName("Preeti kaur");
		transaction119.setBenificaryAccoountNumber("328799954326");
		transaction119.setTransactionAmount("7000");
		transaction119.setTransactionOption("Cheque");
		transaction119.setTransactionStatus("Success");
		transaction119.setTransactionType("Credit");
		LocalDateTime transactionDate119 = LocalDateTime.of(2019, 05, 05, 12, 07, 8);

		transaction119.setTransactionDate(transactionDate119);
		transaction119.setBankName("ICIC Bank");
		

		service.insertTransactionDetails(transaction111);
		service.insertTransactionDetails(transaction112);
		service.insertTransactionDetails(transaction113);
		service.insertTransactionDetails(transaction114);
		service.insertTransactionDetails(transaction115);
		service.insertTransactionDetails(transaction116);
		service.insertTransactionDetails(transaction117);
		service.insertTransactionDetails(transaction118);
		service.insertTransactionDetails(transaction119);
		
		//transaction Details 3
		
		Transaction transaction121 = new Transaction();
		transaction121.setAccountNumber(1170000012L);
		transaction121.setBenificaryName("Ritu Aditiya");
		transaction121.setBenificaryAccoountNumber("111019876234");
		transaction121.setTransactionAmount("5000");
		transaction121.setTransactionOption("Slip");
		transaction121.setTransactionStatus("Success");
		transaction121.setTransactionType("Credit");
		LocalDateTime transactionDate121 = LocalDateTime.of(2019, 03, 01, 11, 30);
		transaction121.setTransactionDate(transactionDate121);
		transaction121.setBankName("SBI Bank");

		

		Transaction transaction122 = new Transaction();
		transaction122.setAccountNumber( 1170000012L);
		transaction122.setBenificaryName("Gurcharan Saini");
		transaction122.setBenificaryAccoountNumber("898989876665");
		transaction122.setTransactionAmount("7000");
		transaction122.setTransactionOption("Slip");
		transaction122.setTransactionStatus("Success");
		transaction122.setTransactionType("Debit");
		LocalDateTime transactionDate122 = LocalDateTime.of(2019, 06, 12, 14, 30);
		transaction122.setTransactionDate(transactionDate122);
		transaction122.setBankName("SBI Bank");

		Transaction transaction123 = new Transaction();
		transaction123.setAccountNumber( 1170000012L);
		transaction123.setBenificaryName("Renu Arora");
		transaction123.setBenificaryAccoountNumber("321456789100");
		transaction123.setTransactionAmount("2000");
		transaction123.setTransactionOption("Slip");
		transaction123.setTransactionStatus("Success");
		transaction123.setTransactionType("Debit");
		LocalDateTime transactionDate123 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction123.setTransactionDate(transactionDate123);
		transaction123.setBankName("Oriental Bank of Commerce");

		Transaction transaction124 = new Transaction();
		transaction124.setAccountNumber( 1170000012L);
		transaction124.setBenificaryName("Akriti Bhadwaraj");
		transaction124.setBenificaryAccoountNumber("321456789100");
		transaction124.setTransactionAmount("7000");
		transaction124.setTransactionOption("Slip");
		transaction124.setTransactionStatus("Success");
		transaction124.setTransactionType("Credit");
		LocalDateTime transactionDate124 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction124.setTransactionDate(transactionDate124);
		transaction124.setBankName("SBI Bank");
		
		
		Transaction transaction125 = new Transaction();
		transaction125.setAccountNumber( 1170000012L);
		transaction125.setBenificaryName("Karan Singh Rajput");
		transaction125.setBenificaryAccoountNumber("101010202020");
		transaction125.setTransactionAmount("12000");
		transaction125.setTransactionOption("Cheque");
		transaction125.setTransactionStatus("Success");
		transaction125.setTransactionType("Credit");
		LocalDateTime transactionDate125 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction125.setTransactionDate(transactionDate125);
		transaction125.setBankName("SBI Bank");
		
		
		Transaction transaction126 = new Transaction();
		transaction126.setAccountNumber( 1170000012L);
		transaction126.setBenificaryName("Aditi Raj Sandhu");
		transaction126.setBenificaryAccoountNumber("123451672635");
		transaction126.setTransactionAmount("8000");
		transaction126.setTransactionOption("Slip");
		transaction126.setTransactionStatus("Success");
		transaction126.setTransactionType("Credit");
		LocalDateTime transactionDate126 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction126.setTransactionDate(transactionDate126);
		transaction126.setBankName("SBI Bank");
		
		Transaction transaction127 = new Transaction();
		transaction127.setAccountNumber( 1170000012L);
		transaction127.setBenificaryName("Adarsh Sharma");
		transaction127.setBenificaryAccoountNumber("123451672635");
		transaction127.setTransactionAmount("6500");
		transaction127.setTransactionOption("Slip");
		transaction127.setTransactionStatus("Success");
		transaction127.setTransactionType("Credit");
		LocalDateTime transactionDate127 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction127.setTransactionDate(transactionDate127);
		transaction127.setBankName("Oriental Bank");
		
		Transaction transaction128 = new Transaction();
		transaction128.setAccountNumber( 1170000012L);
		transaction128.setBenificaryName("Jeevan Rajput");
		transaction128.setBenificaryAccoountNumber("123451672635");
		transaction128.setTransactionAmount("25000");
		transaction128.setTransactionOption("Slip");
		transaction128.setTransactionStatus("Success");
		transaction128.setTransactionType("Credit");
		LocalDateTime transactionDate128= LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction128.setTransactionDate(transactionDate128);
		transaction128.setBankName("Oriental Bank");
		
		
		Transaction transaction129= new Transaction();
		transaction129.setAccountNumber( 1170000012L);
		transaction129.setBenificaryName("Shanaya Avasti");
		transaction129.setBenificaryAccoountNumber("328799954326");
		transaction129.setTransactionAmount("18000");
		transaction129.setTransactionOption("Cheque");
		transaction129.setTransactionStatus("Success");
		transaction129.setTransactionType("Credit");
		LocalDateTime transactionDate129 = LocalDateTime.of(2019, 05, 05, 12, 07, 8);

		transaction129.setTransactionDate(transactionDate129);
		transaction129.setBankName("ICIC Bank");
		

		service.insertTransactionDetails(transaction121);
		service.insertTransactionDetails(transaction122);
		service.insertTransactionDetails(transaction123);
		service.insertTransactionDetails(transaction124);
		service.insertTransactionDetails(transaction125);
		service.insertTransactionDetails(transaction126);
		service.insertTransactionDetails(transaction127);
		service.insertTransactionDetails(transaction128);
		service.insertTransactionDetails(transaction129);
		
		
		//transaction Details 4
		
		Transaction transaction131 = new Transaction();
		transaction131.setAccountNumber(1170000013L);
		transaction131.setBenificaryName("Ritu Aditiya Singh");
		transaction131.setBenificaryAccoountNumber("111019876234");
		transaction131.setTransactionAmount("11000");
		transaction131.setTransactionOption("Slip");
		transaction131.setTransactionStatus("Success");
		transaction131.setTransactionType("Credit");
		LocalDateTime transactionDate131 = LocalDateTime.of(2019, 03, 01, 11, 30,9);
		transaction131.setTransactionDate(transactionDate131);
		transaction131.setBankName("SBI Bank");

		

		Transaction transaction132 = new Transaction();
		transaction132.setAccountNumber( 1170000013L);
		transaction132.setBenificaryName("Navjot Saini");
		transaction132.setBenificaryAccoountNumber("898989876665");
		transaction132.setTransactionAmount("7560");
		transaction132.setTransactionOption("Slip");
		transaction132.setTransactionStatus("Success");
		transaction132.setTransactionType("Debit");
		LocalDateTime transactionDate132 = LocalDateTime.of(2019, 06, 12, 14, 30,07);
		transaction132.setTransactionDate(transactionDate132);
		transaction132.setBankName("SBI Bank");

		Transaction transaction133 = new Transaction();
		transaction133.setAccountNumber( 1170000013L);
		transaction133.setBenificaryName("Renu Arora");
		transaction133.setBenificaryAccoountNumber("321456789100");
		transaction133.setTransactionAmount("6000");
		transaction133.setTransactionOption("Slip");
		transaction133.setTransactionStatus("Success");
		transaction133.setTransactionType("Debit");
		LocalDateTime transactionDate133 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction133.setTransactionDate(transactionDate133);
		transaction133.setBankName("Oriental Bank of Commerce");

		Transaction transaction134 = new Transaction();
		transaction134.setAccountNumber( 1170000013L);
		transaction134.setBenificaryName("Akriti Bhadwaraj");
		transaction134.setBenificaryAccoountNumber("321456789100");
		transaction134.setTransactionAmount("9000");
		transaction134.setTransactionOption("Cheque");
		transaction134.setTransactionStatus("Success");
		transaction134.setTransactionType("Credit");
		LocalDateTime transactionDate134 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction134.setTransactionDate(transactionDate134);
		transaction134.setBankName("SBI Bank");
		
		
		Transaction transaction135 = new Transaction();
		transaction135.setAccountNumber( 1170000013L);
		transaction135.setBenificaryName("Karan Singh Rajput");
		transaction135.setBenificaryAccoountNumber("101010202020");
		transaction135.setTransactionAmount("12000");
		transaction135.setTransactionOption("Slip");
		transaction135.setTransactionStatus("Success");
		transaction135.setTransactionType("Credit");
		LocalDateTime transactionDate135 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction135.setTransactionDate(transactionDate135);
		transaction135.setBankName("SBI Bank");
		
		
		Transaction transaction136 = new Transaction();
		transaction136.setAccountNumber( 1170000013L);
		transaction136.setBenificaryName("Aditi Raj Sandhu");
		transaction136.setBenificaryAccoountNumber("123451672635");
		transaction136.setTransactionAmount("3500");
		transaction136.setTransactionOption("Slip");
		transaction136.setTransactionStatus("Success");
		transaction136.setTransactionType("Credit");
		LocalDateTime transactionDate136 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction136.setTransactionDate(transactionDate136);
		transaction136.setBankName("SBI Bank");
		
		Transaction transaction137 = new Transaction();
		transaction137.setAccountNumber( 1170000013L);
		transaction137.setBenificaryName("Adarsh Sharma");
		transaction137.setBenificaryAccoountNumber("123451672635");
		transaction137.setTransactionAmount("6500");
		transaction137.setTransactionOption("Slip");
		transaction137.setTransactionStatus("Success");
		transaction137.setTransactionType("Credit");
		LocalDateTime transactionDate137 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction137.setTransactionDate(transactionDate137);
		transaction137.setBankName("Oriental Bank");
		
		Transaction transaction138 = new Transaction();
		transaction138.setAccountNumber( 1170000013L);
		transaction138.setBenificaryName("Jeevan Rajput");
		transaction138.setBenificaryAccoountNumber("123451672635");
		transaction138.setTransactionAmount("25000");
		transaction138.setTransactionOption("Slip");
		transaction138.setTransactionStatus("Success");
		transaction138.setTransactionType("Credit");
		LocalDateTime transactionDate138= LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction138.setTransactionDate(transactionDate138);
		transaction138.setBankName("Oriental Bank");
		
		
		Transaction transaction139= new Transaction();
		transaction139.setAccountNumber( 1170000013L);
		transaction139.setBenificaryName("Shanaya Avasti");
		transaction139.setBenificaryAccoountNumber("328799954326");
		transaction139.setTransactionAmount("18000");
		transaction139.setTransactionOption("Cheque");
		transaction139.setTransactionStatus("Success");
		transaction139.setTransactionType("Credit");
		LocalDateTime transactionDate139 = LocalDateTime.of(2019, 05, 05, 12, 07, 8);

		transaction139.setTransactionDate(transactionDate139);
		transaction139.setBankName("ICIC Bank");
		

		service.insertTransactionDetails(transaction131);
		service.insertTransactionDetails(transaction132);
		service.insertTransactionDetails(transaction133);
		service.insertTransactionDetails(transaction134);
		service.insertTransactionDetails(transaction135);
		service.insertTransactionDetails(transaction136);
		service.insertTransactionDetails(transaction137);
		service.insertTransactionDetails(transaction138);
		service.insertTransactionDetails(transaction139);
		
		
		

		Transaction transaction141 = new Transaction();
		transaction141.setAccountNumber(1170000014L);
		transaction141.setBenificaryName("Shivani Sonkhla");
		transaction141.setBenificaryAccoountNumber("111019876234");
		transaction141.setTransactionAmount("11000");
		transaction141.setTransactionOption("Slip");
		transaction141.setTransactionStatus("Success");
		transaction141.setTransactionType("Credit");
		LocalDateTime transactionDate141 = LocalDateTime.of(2019, 03, 01, 11, 30,9);
		transaction141.setTransactionDate(transactionDate141);
		transaction141.setBankName("SBI Bank");

		

		Transaction transaction142 = new Transaction();
		transaction142.setAccountNumber( 1170000014L);
		transaction142.setBenificaryName("Zoya Akhtar");
		transaction142.setBenificaryAccoountNumber("898989876665");
		transaction142.setTransactionAmount("12720");
		transaction142.setTransactionOption("Slip");
		transaction142.setTransactionStatus("Success");
		transaction142.setTransactionType("Debit");
		LocalDateTime transactionDate142 = LocalDateTime.of(2019, 06, 12, 14, 30,07);
		transaction142.setTransactionDate(transactionDate142);
		transaction142.setBankName("SBI Bank");

		Transaction transaction143 = new Transaction();
		transaction143.setAccountNumber( 1170000014L);
		transaction143.setBenificaryName("Renu Arora");
		transaction143.setBenificaryAccoountNumber("321456789100");
		transaction143.setTransactionAmount("6000");
		transaction143.setTransactionOption("Slip");
		transaction143.setTransactionStatus("Success");
		transaction143.setTransactionType("Debit");
		LocalDateTime transactionDate143 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction143.setTransactionDate(transactionDate143);
		transaction143.setBankName("Oriental Bank of Commerce");

		Transaction transaction144 = new Transaction();
		transaction144.setAccountNumber( 1170000014L);
		transaction144.setBenificaryName("Nancy Bhadwaraj");
		transaction144.setBenificaryAccoountNumber("321456789100");
		transaction144.setTransactionAmount("24000");
		transaction144.setTransactionOption("Cheque");
		transaction144.setTransactionStatus("Success");
		transaction144.setTransactionType("Credit");
		LocalDateTime transactionDate144 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction144.setTransactionDate(transactionDate144);
		transaction144.setBankName("SBI Bank");
		
		
		Transaction transaction145 = new Transaction();
		transaction145.setAccountNumber( 1170000014L);
		transaction145.setBenificaryName("Divya Joshi");
		transaction145.setBenificaryAccoountNumber("101010202020");
		transaction145.setTransactionAmount("12000");
		transaction145.setTransactionOption("Slip");
		transaction145.setTransactionStatus("Success");
		transaction145.setTransactionType("Credit");
		LocalDateTime transactionDate145 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction145.setTransactionDate(transactionDate145);
		transaction145.setBankName("SBI Bank");
		
		
		Transaction transaction146 = new Transaction();
		transaction146.setAccountNumber( 1170000014L);
		transaction146.setBenificaryName("Aditi Raj Sandhu");
		transaction146.setBenificaryAccoountNumber("123451672635");
		transaction146.setTransactionAmount("3500");
		transaction146.setTransactionOption("Slip");
		transaction146.setTransactionStatus("Success");
		transaction146.setTransactionType("Credit");
		LocalDateTime transactionDate146 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction146.setTransactionDate(transactionDate146);
		transaction146.setBankName("SBI Bank");
		
		Transaction transaction147 = new Transaction();
		transaction147.setAccountNumber( 1170000014L);
		transaction147.setBenificaryName("Yash Jain");
		transaction147.setBenificaryAccoountNumber("123451672635");
		transaction147.setTransactionAmount("6500");
		transaction147.setTransactionOption("Slip");
		transaction147.setTransactionStatus("Success");
		transaction147.setTransactionType("Credit");
		LocalDateTime transactionDate147 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction147.setTransactionDate(transactionDate147);
		transaction147.setBankName("Oriental Bank");
		
		Transaction transaction148 = new Transaction();
		transaction148.setAccountNumber( 1170000014L);
		transaction148.setBenificaryName("Kayat Ghai");
		transaction148.setBenificaryAccoountNumber("123451672635");
		transaction148.setTransactionAmount("25000");
		transaction148.setTransactionOption("Slip");
		transaction148.setTransactionStatus("Success");
		transaction148.setTransactionType("Credit");
		LocalDateTime transactionDate148= LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction148.setTransactionDate(transactionDate148);
		transaction148.setBankName("Oriental Bank");
		
		
		Transaction transaction149= new Transaction();
		transaction149.setAccountNumber( 1170000014L);
		transaction149.setBenificaryName("Dripti Sandhu");
		transaction149.setBenificaryAccoountNumber("328799954326");
		transaction149.setTransactionAmount("18000");
		transaction149.setTransactionOption("Cheque");
		transaction149.setTransactionStatus("Success");
		transaction149.setTransactionType("Credit");
		LocalDateTime transactionDate149 = LocalDateTime.of(2019, 05, 05, 12, 07, 8);

		transaction149.setTransactionDate(transactionDate149);
		transaction149.setBankName("ICIC Bank");
		

		service.insertTransactionDetails(transaction141);
		service.insertTransactionDetails(transaction142);
		service.insertTransactionDetails(transaction143);
		service.insertTransactionDetails(transaction144);
		service.insertTransactionDetails(transaction145);
		service.insertTransactionDetails(transaction146);
		service.insertTransactionDetails(transaction147);
		service.insertTransactionDetails(transaction148);
		service.insertTransactionDetails(transaction149);
		

		Transaction transaction151 = new Transaction();
		transaction151.setAccountNumber(1170000015L);
		transaction151.setBenificaryName("Diksha Sonkhla");
		transaction151.setBenificaryAccoountNumber("111019876234");
		transaction151.setTransactionAmount("11000");
		transaction151.setTransactionOption("Slip");
		transaction151.setTransactionStatus("Success");
		transaction151.setTransactionType("Credit");
		LocalDateTime transactionDate151 = LocalDateTime.of(2019, 03, 01, 11, 30,9);
		transaction151.setTransactionDate(transactionDate151);
		transaction151.setBankName("SBI Bank");

		

		Transaction transaction152 = new Transaction();
		transaction152.setAccountNumber( 1170000015L);
		transaction152.setBenificaryName("Diya Baati");
		transaction152.setBenificaryAccoountNumber("898989876665");
		transaction152.setTransactionAmount("12720");
		transaction152.setTransactionOption("Slip");
		transaction152.setTransactionStatus("Success");
		transaction152.setTransactionType("Debit");
		LocalDateTime transactionDate152 = LocalDateTime.of(2019, 06, 12, 14, 30,07);
		transaction152.setTransactionDate(transactionDate152);
		transaction152.setBankName("SBI Bank");

		Transaction transaction153 = new Transaction();
		transaction153.setAccountNumber( 1170000015L);
		transaction153.setBenificaryName("Harsha Arora");
		transaction153.setBenificaryAccoountNumber("321456789100");
		transaction153.setTransactionAmount("6000");
		transaction153.setTransactionOption("Slip");
		transaction153.setTransactionStatus("Success");
		transaction153.setTransactionType("Debit");
		LocalDateTime transactionDate153 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction153.setTransactionDate(transactionDate153);
		transaction153.setBankName("Oriental Bank of Commerce");

		Transaction transaction154 = new Transaction();
		transaction154.setAccountNumber( 1170000015L);
		transaction154.setBenificaryName("Nancy Bhadwaraj");
		transaction154.setBenificaryAccoountNumber("321456789100");
		transaction154.setTransactionAmount("24000");
		transaction154.setTransactionOption("Cheque");
		transaction154.setTransactionStatus("Success");
		transaction154.setTransactionType("Credit");
		LocalDateTime transactionDate154 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction154.setTransactionDate(transactionDate154);
		transaction154.setBankName("SBI Bank");
		
		
		Transaction transaction155 = new Transaction();
		transaction155.setAccountNumber( 1170000015L);
		transaction155.setBenificaryName("Divya Joshi");
		transaction155.setBenificaryAccoountNumber("101010202020");
		transaction155.setTransactionAmount("12000");
		transaction155.setTransactionOption("Slip");
		transaction155.setTransactionStatus("Success");
		transaction155.setTransactionType("Credit");
		LocalDateTime transactionDate155 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction155.setTransactionDate(transactionDate155);
		transaction155.setBankName("SBI Bank");
		
		
		Transaction transaction156 = new Transaction();
		transaction156.setAccountNumber( 1170000015L);
		transaction156.setBenificaryName("Anjali Singh");
		transaction156.setBenificaryAccoountNumber("123451672635");
		transaction156.setTransactionAmount("3500");
		transaction156.setTransactionOption("Slip");
		transaction156.setTransactionStatus("Success");
		transaction156.setTransactionType("Credit");
		LocalDateTime transactionDate156 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction156.setTransactionDate(transactionDate156);
		transaction156.setBankName("SBI Bank");
		
		Transaction transaction157 = new Transaction();
		transaction157.setAccountNumber( 1170000015L);
		transaction157.setBenificaryName("Anita Rayat");
		transaction157.setBenificaryAccoountNumber("123451672635");
		transaction157.setTransactionAmount("6500");
		transaction157.setTransactionOption("Slip");
		transaction157.setTransactionStatus("Success");
		transaction157.setTransactionType("Credit");
		LocalDateTime transactionDate157 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction157.setTransactionDate(transactionDate157);
		transaction157.setBankName("Oriental Bank");
		
		Transaction transaction158 = new Transaction();
		transaction158.setAccountNumber( 1170000015L);
		transaction158.setBenificaryName("Onkaar Singh");
		transaction158.setBenificaryAccoountNumber("123451672635");
		transaction158.setTransactionAmount("25000");
		transaction158.setTransactionOption("Slip");
		transaction158.setTransactionStatus("Success");
		transaction158.setTransactionType("Credit");
		LocalDateTime transactionDate158= LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction158.setTransactionDate(transactionDate158);
		transaction158.setBankName("Oriental Bank");
		
		
		Transaction transaction159= new Transaction();
		transaction159.setAccountNumber( 1170000015L);
		transaction159.setBenificaryName("Dripti Sandhu");
		transaction159.setBenificaryAccoountNumber("328799954326");
		transaction159.setTransactionAmount("18000");
		transaction159.setTransactionOption("Cheque");
		transaction159.setTransactionStatus("Success");
		transaction159.setTransactionType("Credit");
		LocalDateTime transactionDate159 = LocalDateTime.of(2019, 05, 05, 12, 07, 8);

		transaction159.setTransactionDate(transactionDate159);
		transaction159.setBankName("ICIC Bank");
		

		service.insertTransactionDetails(transaction151);
		service.insertTransactionDetails(transaction152);
		service.insertTransactionDetails(transaction153);
		service.insertTransactionDetails(transaction154);
		service.insertTransactionDetails(transaction155);
		service.insertTransactionDetails(transaction156);
		service.insertTransactionDetails(transaction157);
		service.insertTransactionDetails(transaction158);
		service.insertTransactionDetails(transaction159);
		
		
	

		Transaction transaction161 = new Transaction();
		transaction161.setAccountNumber(1170000016L);
		transaction161.setBenificaryName("Diksha Sonkhla");
		transaction161.setBenificaryAccoountNumber("111019876234");
		transaction161.setTransactionAmount("11000");
		transaction161.setTransactionOption("Slip");
		transaction161.setTransactionStatus("Success");
		transaction161.setTransactionType("Credit");
		LocalDateTime transactionDate161 = LocalDateTime.of(2019, 03, 01, 11, 30,9);
		transaction161.setTransactionDate(transactionDate161);
		transaction161.setBankName("SBI Bank");

		

		Transaction transaction162 = new Transaction();
		transaction162.setAccountNumber( 1170000016L);
		transaction162.setBenificaryName("Diya Baati");
		transaction162.setBenificaryAccoountNumber("898989876665");
		transaction162.setTransactionAmount("12720");
		transaction162.setTransactionOption("Slip");
		transaction162.setTransactionStatus("Success");
		transaction162.setTransactionType("Debit");
		LocalDateTime transactionDate162 = LocalDateTime.of(2019, 06, 12, 14, 30,07);
		transaction162.setTransactionDate(transactionDate162);
		transaction162.setBankName("SBI Bank");

		Transaction transaction163 = new Transaction();
		transaction163.setAccountNumber( 1170000016L);
		transaction163.setBenificaryName("Harsha Arora");
		transaction163.setBenificaryAccoountNumber("321456789100");
		transaction163.setTransactionAmount("6000");
		transaction163.setTransactionOption("Slip");
		transaction163.setTransactionStatus("Success");
		transaction163.setTransactionType("Debit");
		LocalDateTime transactionDate163 = LocalDateTime.of(2019, 07, 11, 19, 30,05);
		transaction163.setTransactionDate(transactionDate163);
		transaction163.setBankName("Oriental Bank of Commerce");

		Transaction transaction164 = new Transaction();
		transaction164.setAccountNumber( 1170000016L);
		transaction164.setBenificaryName("Nancy Bhadwaraj");
		transaction164.setBenificaryAccoountNumber("321456789100");
		transaction164.setTransactionAmount("24000");
		transaction164.setTransactionOption("Cheque");
		transaction164.setTransactionStatus("Success");
		transaction164.setTransactionType("Credit");
		LocalDateTime transactionDate164 = LocalDateTime.of(2019, 9, 02, 11, 30, 07);
		transaction164.setTransactionDate(transactionDate164);
		transaction164.setBankName("SBI Bank");
		
		
		Transaction transaction165 = new Transaction();
		transaction165.setAccountNumber( 1170000016L);
		transaction165.setBenificaryName("Divya Joshi");
		transaction165.setBenificaryAccoountNumber("101010202020");
		transaction165.setTransactionAmount("12000");
		transaction165.setTransactionOption("Slip");
		transaction165.setTransactionStatus("Success");
		transaction165.setTransactionType("Credit");
		LocalDateTime transactionDate165 = LocalDateTime.of(2019, 12, 12, 11, 30,9);
		transaction165.setTransactionDate(transactionDate165);
		transaction165.setBankName("SBI Bank");
		
		
		Transaction transaction166 = new Transaction();
		transaction166.setAccountNumber( 1170000016L);
		transaction166.setBenificaryName("Anjali Singh");
		transaction166.setBenificaryAccoountNumber("123451672635");
		transaction166.setTransactionAmount("3500");
		transaction166.setTransactionOption("Slip");
		transaction166.setTransactionStatus("Success");
		transaction166.setTransactionType("Credit");
		LocalDateTime transactionDate166 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction166.setTransactionDate(transactionDate166);
		transaction166.setBankName("SBI Bank");
		
		Transaction transaction167 = new Transaction();
		transaction167.setAccountNumber( 1170000016L);
		transaction167.setBenificaryName("Anita Rayat");
		transaction167.setBenificaryAccoountNumber("123451672635");
		transaction167.setTransactionAmount("6500");
		transaction167.setTransactionOption("Slip");
		transaction167.setTransactionStatus("Success");
		transaction167.setTransactionType("Credit");
		LocalDateTime transactionDate167 = LocalDateTime.of(2020, 02, 01, 11, 30,5);
		transaction167.setTransactionDate(transactionDate167);
		transaction167.setBankName("Oriental Bank");
		
		Transaction transaction168 = new Transaction();
		transaction168.setAccountNumber( 1170000016L);
		transaction168.setBenificaryName("Onkaar Singh");
		transaction168.setBenificaryAccoountNumber("123451672635");
		transaction168.setTransactionAmount("25000");
		transaction168.setTransactionOption("Slip");
		transaction168.setTransactionStatus("Success");
		transaction168.setTransactionType("Credit");
		LocalDateTime transactionDate168= LocalDateTime.of(2020, 02, 01, 11, 30);
		transaction168.setTransactionDate(transactionDate168);
		transaction168.setBankName("Oriental Bank");
		
		
		Transaction transaction169= new Transaction();
		transaction169.setAccountNumber( 1170000016L);
		transaction169.setBenificaryName("Dripti Sandhu");
		transaction169.setBenificaryAccoountNumber("328799954326");
		transaction169.setTransactionAmount("18000");
		transaction169.setTransactionOption("Cheque");
		transaction169.setTransactionStatus("Success");
		transaction169.setTransactionType("Credit");
		LocalDateTime transactionDate169 = LocalDateTime.of(2019, 05, 05, 12, 07, 8);

		transaction169.setTransactionDate(transactionDate169);
		transaction169.setBankName("ICIC Bank");
		

		service.insertTransactionDetails(transaction161);
		service.insertTransactionDetails(transaction162);
		service.insertTransactionDetails(transaction163);
		service.insertTransactionDetails(transaction164);
		service.insertTransactionDetails(transaction165);
		service.insertTransactionDetails(transaction166);
		service.insertTransactionDetails(transaction167);
		service.insertTransactionDetails(transaction168);
		service.insertTransactionDetails(transaction169);

		
		
	}

}
