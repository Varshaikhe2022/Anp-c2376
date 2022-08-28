package org.service;
//import java.util.*;
public class Service {
int n;
	
	 public int CalculateSum (int n) {
		 int sum=0;
		 System.out.println("\n Enter the natural numbers ");
		 //n=sc.nextInt();
		 for(int i=1;i<n;i++) {
			 if(i%3==0 && i %5==0) {
			 System.out.println(i);
			 
			 sum=sum+1;
			  
		 }
	 }
		 //System.out.println("Sum is+sum);
		 return sum;
		 
}
	 public int calculateDifference(int n) {
		 int total=0, sum1=0,sqr=0,diff=0;
		 for(int i=1;i<=n;i++) {
			 
		 
			 System.out.println(i);
			 total=total+(i*i);
		 }
		 System.out.println("sum of the square is" +total);
		 
		 for(int i=1;i<=n;i++){
			 
			 System.out.println(i);
			 
			 sum1=sum1+i;
			 
			 
			 sqr=sum1*sum1;
			 
		 }
		 System.out.println("sqare of the sum "+sqr);
		 diff=total-sqr;
		 //System.out.println("different of both is" +diff);
		 return diff;	 
		 }
	 public boolean checkNumber(int number) {
		 //Getting length of Number
		 int l=(int)(Math.log10 (number)+1);
		 int flag1=0,flag2=0;
		 for(int i=1;i<=l;i++) {
			 flag1=n%10;
			 n=n/10;
			 flag2=n%10;
			 if(flag1<flag2){
				 break;
				 
			 }
			 if(i==l){
				 return true;
				 
			 }
		 }
		 return false;
	 }
	 public boolean CheckNumber(int n) {
		 if(n==0)
			 return false;
		 while(n!=1) {
			 if(n%2!=0)
				 return false;
			 n=n/2;
		 }
		 return true;
			 
		 }
	 }
		 
	 
	 
