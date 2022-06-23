package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {

	final private float creditLimit;
	
	public CurrentAcc(int accNo,String accNm,float accBal,float creditLimit)
	{
		super(accNo,accNm,accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Account no is"+this.getaccNo());
	}
	
	@Override
	public String toString() 
	{
		return String.format("CurrentAcc [creditLimit=%s,toString=%s]",creditLimit,super.toString());
	}
	
}
