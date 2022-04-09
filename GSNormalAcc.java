package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{
    public GSNormalAcc(int accNo, String accNm, float charges , float deliveryCharges)
    {
       super(accNo,accNm,charges);
    }
	    
    @Override
  public void bookProduct(float d) 
    {
		super.bookProduct(d);
    }
	 
  @Override
  public String toString() 
    {
    
	return super.toString();
    }
}

