import java.util.HashMap;
import java.util.List;

public class Fleche {

	
	
	  public static int minPathSum(int[][] grid) {
	      int[][] a =new int[grid.length][grid[0].length];
	      int sum =grid[0][0];
	      a[0][0]=sum;
		  for (int i = 1; i < grid[0].length; i++) {
			  a[0][i]=grid[0][i]+sum;
			  sum=a[0][i];
		}
		  
		  
		  int sum1 =grid[0][0];
	      a[0][0]=sum1;
		  for (int i = 1; i < grid.length; i++) {
			  a[i][0]=grid[i][0]+sum1;
			  sum1=a[i][0];
		}
		  
		  for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				a[i][j]= Math.min(a[i-1][j], a[i][j-1])+grid[i][j];
			}
		}
		  
		

		  
		  
		  return a[grid.length-1][grid[0].length-1];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,5},{3,2,1}};
		
		System.out.println(minPathSum(a));
		
	}

}
