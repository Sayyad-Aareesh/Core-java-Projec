package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc 
{
   private boolean isPrime=true;
   
   float charges;
   
   private static final float deliveryCharges=0;
   
   
  public boolean isPrime() 
  {
	  return isPrime;
  }

  public static float getDeliverycharges() 
  {
	  return deliveryCharges;
  }

  public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
  {
	  super(accNo, accNm, charges);
	  this.isPrime = isPrime;
	  this.charges = charges;
  }

 @Override
  public void bookProduct(float charges) 
  {
	  System.out.println(charges);
  }

  @Override
  public String toString()
   {
	   return "Dear Prime user, Your Product charges are: " +charges;
   }
}

