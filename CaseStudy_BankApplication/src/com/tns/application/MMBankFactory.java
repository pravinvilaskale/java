package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.SavingAcc;



public class MMBankFactory extends BankFactory{
	
	public MMSaving getNewSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried)
	{
		SavingAcc s = new SavingAcc();
		return s;
	}
}
