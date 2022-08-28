package org.view;
import org.service.Service;
public class Main {

	public static void main(String[] args) {
		Service sObj=new Service();
		int sum=0;
		
		sum=sObj.CalculateSum(100);
		
		System.out.println("sum is"+sum);
		int diff=0;
		diff=sObj.calculateDifference(5);
		System.out.println("diffence of the both is"+diff);
		sObj.checkNumber(134468);
		
		
		System.out.println("Enter number is a power of 2 or not");
		if(sObj.checkNumber(31)) {
			System.out.println("yes");
			
		}
		else {
			System.out.print("no");
	
		}
		System.out.println("Enter number is a power of 2 or not");
		if(sObj.CheckNumber(64))
		{
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
			
		}
			
			
		 
		
		

	}

}
