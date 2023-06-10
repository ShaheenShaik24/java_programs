
import java.util.*;
import java.lang.*;
import java.io.*;

class Sem_Chapters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of test case:");
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)
		{
                   System.out.println("Enter no. of courses for the semester i.e, X:");
                     int X=sc.nextInt();
                   System.out.println("Enter no. of units  i.e, Y:");
                      int Y=sc.nextInt();
                   System.out.println("Enter no. of chapter i.e, Z:");
		    int Z=sc.nextInt();
		    System.out.println("Total no.of chapters for the semester is:"+X*Y*Z+"\n");
		}
	}
}
		
