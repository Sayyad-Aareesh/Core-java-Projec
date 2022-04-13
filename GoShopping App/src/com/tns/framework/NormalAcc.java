package com.tns.framework;

public  class NormalAcc extends ShopAcc
{
	public static final float deliveryCharges =50;
	
	public static float getDeliverycharges() 
	{
		return deliveryCharges;
	}
	
	
	
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges)
	{
		super(accNo, accNm, charges);
		this.getDeliverycharges();
	}

	
	
	
	
	@Override
	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal user, Your Product charges are: " + charges 
				+ " with Delivery Charges is : "+ deliveryCharges);
	}



	@Override
	public String toStrig() {
		
		return super.toStrig();
	}
		
	
	

	
}
