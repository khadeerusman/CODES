package in.ac.kletech.customer;

  abstract class Customer {
 	int custID;
 	String custName;
 	long phoneNum;
 	float custBillAmt;
 	public Customer(String custName,int custID,  long phoneNum, float custBillAmt) {
 		this.custName = custName;
 		this.custID = custID;
 		this.phoneNum = phoneNum;
 		this.custBillAmt = custBillAmt;
 	}
 }
 
 class RegularCustomer extends Customer{
 	RegularCustomer(int custID,String custName,long phoneNum,float custBillAmt)
 	{
 		super(custName,custID,phoneNum,custBillAmt);
 	}
 	void printCustomerInfo(){
 		System.out.println("Customer ID:" +custID);
 		System.out.println("Customer Name:" +custName);
 		System.out.println("Customer Phone No:" +phoneNum);
 		System.out.println("Bill Amount:" +custBillAmt);
 	}
 	void computecustBillAmt(){
 		int revisit = 0;
 		double discount;
 		float bill;
 		discount=custBillAmt*0.3;
 		bill=(float) (custBillAmt-discount);
 		System.out.println("Bill after Discount : " +bill);
 		if(revisit==1)
 			RegularDiscount();
 		revisit=1;
 	}
 	void RegularDiscount(){
 		System.out.println("Customer Revisited" );
 		double revisitDis;
 		float revisitBill;
 		revisitDis=custBillAmt*0.4;
 		revisitBill=(float) (custBillAmt-revisitDis);
 		System.out.println("Revisit Discount : "+ revisitDis);
 		System.out.println("Total Bill after Revisit and removing Discount : " +revisitBill);
 		System.out.println("------------------------------------");
 		
 	}
 	
 }
 class PrivilegedCustomer extends Customer{
 	PrivilegedCustomer(int custID,String custName,long phoneNum,float custBillAmt)
 	{
 		super(custName,custID,phoneNum,custBillAmt);
 	}
 	void printCustomerInfo(){
 		System.out.println("PRIVILEGED CUSTOMERS DETAILS:");
 		System.out.println("Customer ID:" +custID);
 		System.out.println("Customer Name:" +custName);
 		System.out.println("Customer Phone No:" +phoneNum);
 		System.out.println("Bill Amount:" +custBillAmt);
 	}
 	void computecustBillAmt(){
 		double discount;
 		float bill;
 		discount=custBillAmt*0.5;
 		bill=(float) (custBillAmt-discount);
 		System.out.println("Discounted Bill:" +bill);
 		System.out.println("----------");
 	}
 }