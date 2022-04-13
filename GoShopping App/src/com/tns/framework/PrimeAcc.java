package com.tns.framework;

public class PrimeAcc extends ShopAcc 
{
	protected boolean isPrime;
	public static final float deliveryCharges=50;
		
	
	
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		
	}
	
	
	
	@Override
	public void bookProduct(float charges) {
		System.out.println("Dear Prime user, Your Product charges are: " +charges);
		
	}



	public void items(float charges) {
				
	}
	


	public boolean isPrime() 
	{
		return isPrime;
	}

	public void setPrime(boolean isPrime)
	{
		this.isPrime = isPrime;
	}

	

	@Override
	public String toStrig() {
		
		return super.toStrig();
	}

			
	
	
}
