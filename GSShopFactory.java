package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory 
{
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
    {
	GSPrimeAcc GSPrime = new GSPrimeAcc(234046,"Prime Acc",4500,true);
	
	System.out.println(GSPrime.toString());
	return GSPrime;
    }

   @Override
   public NormalAcc getNewNormalAccount(int accNo, String accNm, float 		charges, float deliveryCharges) 
   {
	  GSNormalAcc GSNormal = new GSNormalAcc(23045,"Normal Acc",2500,deliveryCharges);

	  System.out.println(GSNormal.toString());
	  return GSNormal;
   }
	 
	 
	 public static void main(String args[])
	{
		GSShopFactory shope=new GSShopFactory();
				
		shope.getNewNormalAccount(accNm,accNm,charges,deliveryCharges);
		shope.getNewPrimeAccount(accNo,accNm,charges,isPrime);
	}

}

