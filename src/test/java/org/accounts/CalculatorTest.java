/**
 * 
 */
package org.accounts;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shreemaan-Home
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Calculator obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		 obj=new Calculator();
	}

	/**
	 * Test method for {@link org.accounts.Calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		
		int result=obj.add(2, 3);
		assertEquals(5, result);
	
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.accounts.Calculator#subtract(int, int)}.
	 */
	//@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.accounts.Calculator#multiplication(int, int)}.
	 */
	//@Test
	public void testMultiplication() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.accounts.Calculator#division(int, int)}.
	 */
	//@Test
	public void testDivision() {
		fail("Not yet implemented");
	}

}
