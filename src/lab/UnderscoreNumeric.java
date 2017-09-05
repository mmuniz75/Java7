package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnderscoreNumeric {

	@Test
	public void test1000() {
		assertEquals(1_000,1000);
	}
	
	@Test
	public void test1000000() {
		assertEquals(1_000_000,1000000);
	}
	
	@Test
	public void test1000000000() {
		assertEquals(1_000_000_000,1000000000);
	}
	
	@Test
	public void test1000000000000() {
		assertTrue(1_000_000_000_000D==1000000000000D);
	}
	

}
