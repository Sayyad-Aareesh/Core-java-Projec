package com.tns.framework;

public abstract class NormalAcc extends ShopAcc 
{
	  private final float deliveryCharges=49;
	  
	  float charges;
  
	 public float getDeliveryCharges() 
	  {
		  return deliveryCharges;
	  }
 
	  public NormalAcc(int accNo,String accNm,float charges)
	 {
		 super(accNo,accNm,charges);
	 }
	 
	 @Override
	 public void bookProduct(float b) 
	 {
		 System.out.println();
	 }

	 @Override
	 public String toString() 
	 {
		return "Dear Normal user, Your Product charges are: " + charges + " with Delivery Charges is : " + deliveryCharges ;
	 }
}

