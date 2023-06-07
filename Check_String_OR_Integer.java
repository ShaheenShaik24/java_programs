import java.io.*;
import java.util.Scanner;
public class Check_String_OR_Integer {
 
    // Returns true if s is
    // a number else false
    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }
 
   
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string or integer:");
        String str=sc.nextLine();
 
       
        if (isNumber(str))
            System.out.println("Given data " +str+" is an  Integer");
 
        
        else
            System.out.println("Given data  " +str+" is a  String");
    }
}