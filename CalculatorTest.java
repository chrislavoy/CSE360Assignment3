package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import cse360assign2.OrderedIntList;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calculator = new Calculator();
		assertNotNull(calculator);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		assertEquals(5, calculator.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		calculator.add(3);
		assertEquals(8, calculator.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		calculator.subtract(3);
		assertEquals(2, calculator.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		calculator.multiply(3);
		assertEquals(15, calculator.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		calculator.add(25);
		calculator.divide(5);
		assertEquals(5, calculator.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		calculator.subtract(3);
		calculator.multiply(10);
		calculator.divide(4);
		assertEquals("0 + 5 - 3 * 10 / 4", calculator.getHistory());
	}
}
