package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	public void testMin() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.min(5, 3), 2);
	}
}
