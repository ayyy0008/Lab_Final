package pk.cui.sc.labfinal;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	private static Calculator cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		cal = new Calculator();	
	}
	
	@Test
	public void testMax(){
		assertEquals(19,cal.findMax(15, 19, 5));
	}
	
	@Test
	public void testSquare1(){
		assertEquals(9,cal.square(3));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSquare2(){
		cal.square(-1);
	}
	
	@Test 
	public void testCube1(){
		assertEquals(8,cal.cube(2));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Calss");
	}

}
