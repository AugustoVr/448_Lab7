package lab7;

public class matrix {
	int max_size = 10;
	int n = 0;
	double [][] mdata = new double[max_size][max_size];
	
	public matrix(int num){
		//System.out.println(num + "object");
		//num = max_size;
		n = num;
	}
	
	public double determinant(){
		double det = 0.0;
		
		if (n == 1)
		{
			det = mdata[0][0];
		}
		else if (n == 2)
		{
			det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
		}
		else
		{
			for (int i = 0; i < n;i++)
			{
				det += java.lang.Math.pow(-1.0, (double)i) * mdata[0][i] * subMatrix(0, i).determinant();

			}
		}
		
		return det;
	}//end determinant
	
	public matrix inverse(){
		//System.out.println("enter");
		matrix inv = new matrix(n);
		//System.out.println("exit");
		
		double det = determinant();
		
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < n; ++j)
			{
				inv.mdata[i][j] = java.lang.Math.pow(-1.0, (double) i + j) * subMatrix(j, i).determinant() / det;
			}
		}
		//System.out.println("deeet" + det);
		return inv;
	}
	
	public matrix subMatrix(int r, int c){
		matrix sub = new matrix(n-1);
		
		int row = 0; 
		for (int i = 0; i < n; ++i)
		{
			if (i == r) continue;
			
			int col = 0;
			for (int j = 0; j < n; ++j)
			{
				if (j == c) continue;
				//System.out.println( "submatrix with row,col,i,j = " + row + " " + col + " "+ r + " "+ c);
				//System.out.println( "sub = "+ mdata[i][j]);
				sub.mdata[row][col] = mdata[i][j];
				++col;
			}
			
			++row;
		}
		
		return sub;
	}
	
}
