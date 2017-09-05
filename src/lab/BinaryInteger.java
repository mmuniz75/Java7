package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryInteger {

	@Test
	public void test() {
		assertEquals(1,0b000001);
	}
	
	@Test
	public void test2() {
		assertEquals(2,0b000010);
	}
	
	@Test
	public void test4() {
		assertEquals(4,0b000100);
	}
	
	@Test
	public void test8() {
		assertEquals(8,0b001000);
	}
	
	@Test
	public void test16() {
		assertEquals(16,0b010000);
	}
	
	@Test
	public void test32() {
		assertEquals(32,0b100000);
	}

}
