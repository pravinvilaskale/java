package com.tns.framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo,String accNm,float accBal)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println(accBal);
	}
	
	public void deposite(float accBal)
	{
		System.out.println(accBal);
	}
	
	@Override
	public String toString() 
	{
		return String.format("BankAcc [accNo=%s,accNm=%s,accBal=%s]",accNo,accNm,accBal);
	}

}
