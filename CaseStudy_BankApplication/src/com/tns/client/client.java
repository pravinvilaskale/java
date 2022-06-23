package com.tns.client;

import com.tns.application.*;
import com.tns.framework.*;

public class client {
	
	public static void main(String args[])
	{
	
		BankFactory b =new MMBankFactory();
		SavingAcc s= new MMSavingAcc(809698682,"pravin kale", 30000, true);
		CurrentAcc c = new MMCurrentAcc(964202412,"mayur", 35000,10000);
		System.out.println("Saving Account");
		s.withdraw(s.getaccBal());
		System.out.println("Current Account");
		c.withdraw(c.getaccBal());
		System.out.println(b.getNewSavingAcc(798163,"john",80000,true));
		System.out.println(b.getNewCurrentAcc(970313,"dan",50000,1000));
		System.out.println(c);
		System.out.println(s);
	   
	}  
	   

}
