import java.util.*;
 
public class Remove_Duplicate_Elements {
 
    
 
    public static int remove(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    public static void main(String[] args)
    {
        
       	int arr[] = new int[20];
 	System.out.println("How many elements do you want to enter: ");
 	Scanner s = new Scanner(System.in);
         int n=s.nextInt();
 	
 	System.out.println("Enter "+n +"  array elements(in sorted order):");
        for(int i = 0; i < n; i++)
        {
                 arr[i] = s.nextInt();
                 System.out.print(" ");
    	     }
                  
      n = remove(arr, n);
 
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
   }
}