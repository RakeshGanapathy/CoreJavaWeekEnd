package com.app.mod.Impl;

public class BankImpl {
	String custId;
	String custName;
	long custPhone;
	boolean status;

	public static void main(String[] args) {
		BankImpl ref = new BankImpl();
		ref.custName = "Rakesh";
		ref.custId = "23DS";
		ref.custPhone = 1233219499314L;
		ref.status = true;
		BankImpl ref2 = new BankImpl();
		ref2.custName = "vinod";
		ref2.custId = "12DS";
		ref2.custPhone = 9499314L;
		ref2.status = false;
		System.out.println(ref);
		System.out.println(ref2);
		System.out.println(ref.custId + " " + ref.custName + " " + ref.custPhone + " " + ref.status);
		System.out.println(ref2.custId + " " + ref2.custName + " " + ref2.custPhone + " " + ref2.status);
	}
}
