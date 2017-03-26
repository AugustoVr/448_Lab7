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

}
