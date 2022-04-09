package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;

public class Online_Shope 
{
     public static void main(String args[]) 
	{
		GSPrimeAcc prime = new GSPrimeAcc(1, "AAreesh", 5600, true);
		GSNormalAcc normal = new GSNormalAcc(2, "Shravani",3400, 49);
		
		prime.bookProduct(5600);
		normal.bookProduct(3400);
		
		System.out.println(prime.toString());
		System.out.println();
		System.out.println(normal.toString());
	}
	
}

    