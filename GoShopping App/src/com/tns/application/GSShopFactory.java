package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public  class GSShopFactory implements ShopFactory
{
	
	
		
	public static void main(String[] args) {
		

		/*GSShopFactory gsshopFactory=new GSShopFactory(); 
		
		gsshopFactory.getNewPrimeAccount(111234,"GSPrimeAcc",560, true);
		gsshopFactory.getNewNormalAccount(2111130,"New Prime Acc",780, 50);
	*/
	}

	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		GsPrime.bookProduct(charges);
	
		return GsPrime;

	}

	@Override
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc GSNormal = new GSNormalAcc(23045,"Normal Acc",2500,deliveryCharges);

			GSNormal.bookProduct(deliveryCharges);
		  return GSNormal;
	}

		
	
	

}
