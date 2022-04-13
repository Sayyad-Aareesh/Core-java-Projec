package com.tns.application;

import java.util.Scanner;

import com.tns.framework.*;

public class Online_Shope {

	
	public static void main(String[] args) 
	{
			/*GSPrimeAcc gsPrimeacc=new GSPrimeAcc(1234569,"PrimeAcc", 600, true);
	
		
				gsPrimeacc.bookProduct(600);
				gsPrimeacc.toStrig();
				
				GSNormalAcc gsNormalacc=new GSNormalAcc(111134, "Prime ACc",500,50);
				
				
				gsNormalacc.bookProduct(500);
				gsNormalacc.toStrig();

GSShopFactory gsshopFactory=new GSShopFactory(); 
		
		gsshopFactory.getNewPrimeAccount(111234,"GSPrimeAcc",560, true);
		gsshopFactory.getNewNormalAccount(2111130,"New Prime Acc",780, 50);
	



				*/
		
		
		
		do
		{
			System.out.println("1]GSPrime Account");
			System.out.println("2]GSNormal Account");
			System.out.println("3]Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			
			
			switch(ch)
			{
			case 1:
				GSPrimeAcc gsPrimeacc=new GSPrimeAcc(1234569,"PrimeAcc", 600, true);
				
				
				gsPrimeacc.bookProduct(600);
				gsPrimeacc.toStrig();
				break;
				
			case 2:
				
				GSNormalAcc gsNormalacc=new GSNormalAcc(111134, "Prime ACc",500,50);
				
				
				gsNormalacc.bookProduct(500);
				gsNormalacc.toStrig();
				
				break;
				
			case 3:
				  
						
				System.out.println("Invalid Choice");
				System.exit(0);
				
				System.out.println();
				break;
				
			}
		}while(true);
	}

	
}
