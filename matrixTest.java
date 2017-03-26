package lab7;

import static org.junit.Assert.*;

import org.junit.Test;

public class matrixTest {

	@Test
	public void testDet() {
		//fail("Not yet implemented");
		matrix ob = new matrix(3);
		
		ob.mdata[0][0]=5;
		ob.mdata[0][1]=4;
		ob.mdata[0][2]=3;
		ob.mdata[1][0]=6;
		ob.mdata[1][1]=9;
		ob.mdata[1][2]=1;
		ob.mdata[2][0]=2;
		ob.mdata[2][1]=5;
		ob.mdata[2][2]=3;
		
		assertEquals(82.0, ob.determinant(), 0.001);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testInv(){
		matrix ob = new matrix(3);

		ob.mdata[0][0]=5;
		ob.mdata[0][1]=4;
		ob.mdata[0][2]=3;
		ob.mdata[1][0]=6;
		ob.mdata[1][1]=9;
		ob.mdata[1][2]=1;
		ob.mdata[2][0]=2;
		ob.mdata[2][1]=5;
		ob.mdata[2][2]=3;
		
		matrix inv = ob.inverse();
		double n = inv.determinant();
		double m = 1/ob.determinant();
		
		//det(A) = 1/(det(Ainv))
		assertEquals(n,m,0.1);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSub(){
		matrix ob = new matrix(3);

		ob.mdata[0][0]=5;
		ob.mdata[0][1]=4;
		ob.mdata[0][2]=3;
		ob.mdata[1][0]=6;
		ob.mdata[1][1]=9;
		ob.mdata[1][2]=1;
		ob.mdata[2][0]=2;
		ob.mdata[2][1]=5;
		ob.mdata[2][2]=3;
		
		//since matrix is reduced by 1 unit size, start is 1,1 and not 0,0
		//resulting matrix should be if eliminating i =0 and j = 0 ->
		/* 9 1
		 * 5 3
		*/

		matrix sub = ob.subMatrix(0,0);
		assertEquals(ob.mdata[1][1], sub.mdata[0][0], 0.1); // 9
		
		//resulting matrix should be if eliminating i =1 and j = 1 ->
				/* 5 3
				 * 2 3
				*/
		sub = ob.subMatrix(1,1);
		assertEquals(3, sub.mdata[1][1], 0.1);
		
	}

}
