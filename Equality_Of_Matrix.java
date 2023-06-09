import java.util.Scanner;

public class  Equality_Of_Matrix{
	private static Scanner sc;
	
	public static void main(String[] args) {
		int i, j, row1, col1,row2,col2, isEqual = 1;	
		
		sc= new Scanner(System.in);	
		
		System.out.println("\n Enter Matrix1 Rows & Columns :  ");
		row1 = sc.nextInt();
		col1 = sc.nextInt();
		
		int[][] x = new int[row1][col1];
       System.out.println("\n Enter Matrix2 Rows & Columns :  ");
		row2 = sc.nextInt();
		col2 = sc.nextInt();
		int[][] y = new int[row2][col2];
		if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }    
        else
           {
		System.out.println("\n Enter " +row1*col1+"  elements for First Matrix Items :  ");
		for(i = 0; i < row1; i++) {
			for(j = 0; j < col1; j++) {
				x[i][j] = sc.nextInt();
			}		
		}
		
		System.out.println("\n Enter " +row1*col1+"  elements for First Matrix Items :  ");
	
		for(i = 0; i < row2; i++) {
			for(j = 0; j < col2; j++) {
				y[i][j] = sc.nextInt();
			}		
		}
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				if(x[i][j] != y[i][j]) {
					isEqual = 0;
					break;
				}
			}
		}
             if(isEqual == 1) {
			System.out.println("\nMatrix x is Equal to Matrix y");
		}
             else {
			System.out.println("\nMatrix x is Not Equal to Matrix y");
		}
            }
		
		
	}
}