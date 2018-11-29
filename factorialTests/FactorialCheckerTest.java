package factorialTests;
import static org.junit.Assert.*;

import org.junit.*;

import factorialExercise.FactorialChecker;


public class FactorialCheckerTest {
	
	@Test 
	public void testIfFactorial() {
		
		FactorialChecker fc = new FactorialChecker();
		
		assertTrue("Is not factorial", fc.isNumFactorial(120));
		
		
	}
	

}



