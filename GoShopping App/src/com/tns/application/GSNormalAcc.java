package com.tns.application;

import com.tns.framework.*;

public class GSNormalAcc extends NormalAcc
{
	

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}


	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toStrig() 
	{
		
		return super.toStrig();
	}
	public static void main(String args[])
	{
	
	}
		
}
	
	

	


