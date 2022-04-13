package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float Charges=50;
	//private static String string;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges, isPrime);
				
	}
	
	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}


	@Override
	public String toString()
	{
		
		return "Dear Prime user, Your Product charges are: " +charges;
	}

	public static float getCharges()
	{
		return Charges;

	}
		
	
	public static void main(String args[])
	{
		GSPrimeAcc gsPrimeacc=new GSPrimeAcc(1234564,"PrimeAcc", 450, true);
	
		
		gsPrimeacc.bookProduct(charges);
		gsPrimeacc.toStrig();
	}



}