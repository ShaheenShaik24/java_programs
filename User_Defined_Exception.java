import java.util.Scanner;

class Insufficient_bal_exception extends Exception
{
  Insufficient_bal_exception(String msg)
     {
        System.out.println(msg);
      }
}
class User_Defined_Exception
{
 public static void main(String args[])throws Insufficient_bal_exception
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter total amount of your account  and amount to withdraw:");
 
  int tamt,wamt;
  tamt=sc.nextInt();
  wamt=sc.nextInt();
   int bal=tamt-wamt;
 amt(bal);
}

 public static void amt(int bal)throws Insufficient_bal_exception
{
 if(bal<2000)
  throw new Insufficient_bal_exception("Balance is insufficient!! you can not withdraw amount");
   
 else
   System.out.println("Balance is sufficient ..you can withdraw amount");
}

}