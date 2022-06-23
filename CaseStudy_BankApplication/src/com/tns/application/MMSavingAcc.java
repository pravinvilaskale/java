package com.tns.application;
import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	final static private float MINBAL=0.0f;
	
	public MMSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried)
	{
		super(accNo,accNm,accBal,isSalaried);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println(accBal);
	}
	
	@Override
	public String toString() 
	{
		return String.format("MMSavingAcc [MINBAL=%s]",super.toString());
	}

}
