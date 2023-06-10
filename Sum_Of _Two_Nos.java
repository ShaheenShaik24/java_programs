/* package codechef; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sum_Of _Two_Nos
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
           System.out.println("Enter no.of cases you want to test:");
	    int T=sc.nextInt();
	    for(int i=1;i<=T;i++){
              System.out.println("Enter A,B,C values:");
	    int A=sc.nextInt();

	    int B=sc.nextInt();
	    int C=sc.nextInt();
		if(C==(A+B)){
		   System.out.println("YES");
		}else{
		     System.out.println("NO");
		}
	    }
	}
}
				 
	
