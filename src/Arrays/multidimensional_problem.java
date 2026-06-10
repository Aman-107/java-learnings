package Arrays;

public class multidimensional_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print minimum and maximum number present in the 2D matrix

		//		int a[][] = {{9,5,7,1}, {9,7,2,3},{7,0,1,1}};
//		int mini = a[0][0];
//		int maxi = a[0][0];
//		
//		for ( int i=0; i<a.length; i++) {
//			for(int j=0; j<a[0].length; j++) {
//				if(a[i][j] < mini && a[i][j] != 0)
//					mini = a[i][j];
//				if (a[i][j] > maxi)
//					maxi = a[i][j];
//			}
//		}
//		System.out.println("minimum " + mini);
//		System.out.println("maximum " + maxi);
		
		
		/*
		 9  5  7  1
		 9  7  2  3
		 7  0  1  1
		 
		 minimum is 2 hence maximum in that column is 7 therefore output should be 7.
		 */
		
		int b[][] = {{9,5,7,1}, {9,7,2,3},{7,0,1,1}};
		int mini =b[0][0];
		int col = 0,row =0;
		
		for (int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				if(b[i][j] < mini) {
					mini = b[i][j];
					col = j;
					row = i;
				}
			}
		}

// Que -> Find minimum number and then print the maximum number of that column in which minimum number is present.		
		int col_maxi = Integer.MIN_VALUE;
//		for(int i=0; i<b.length; i++) {
//			for(int j = col; j<=col; j++) {
//				if (b[i][j] > col_maxi) {
//					col_maxi = b[i][j];
//				}
//			}
//		}
		// Above is also correct but we are using 2 loops hence space complexity increase instead we will use while loop
		
		int k =0;
		while(k<b[0].length && k <= row) {
			if (b[k][col] > col_maxi) {
				col_maxi = b[k][col];
			}
			k++;
		}	
	System.out.println("column maximum is " + col_maxi);	
	}
}
