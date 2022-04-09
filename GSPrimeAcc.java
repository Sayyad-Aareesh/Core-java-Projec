package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{
	private static final float Charges=50;
	
	public float getCharges()
	{
		return Charges;
	}
	
	public GSPrimeAcc(int accNo,String accNm, float charges, boolean isPrime)
	{
		super(accNo,accNm,charges,isPrime);
	}
	
	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}
}

