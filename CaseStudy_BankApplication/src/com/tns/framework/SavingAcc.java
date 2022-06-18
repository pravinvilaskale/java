package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	private float MINBAL;
	
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) 
	{
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println(accBal);
	}
	
	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalaried=%s]",isSalaried);
	}
	
}
