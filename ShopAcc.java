package com.tns.framework;

import java.util.Scanner;

public abstract class ShopAcc {
	
	public int accNo;
	public String accNm;
	public static float charges;
	

	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	abstract public void bookProduct(float charges);
	 public void items(float charges)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item Price");
		charges=sc.nextFloat();
		System.out.println("Price :"+charges);
	 }
	 
	
	public String toStrig()
	{  
		  return accNo+" "+accNm+" "+charges;  
	}  

}
