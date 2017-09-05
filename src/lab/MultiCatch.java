package lab;

import static org.junit.Assert.fail;

import org.junit.Test;

public class MultiCatch {

	
	@Test
	public void test0() {
		try{
			getException(0);
		}catch(IllegalAccessError iae){
			
		}
		
	}
	
	@Test
	public void test2() {
		try{
			getException(1);
		}catch(IllegalArgumentException iae){
			
		}
		
	}
	
	@Test
	public void test3() {
		try{
			getException(10);
		}catch(IllegalStateException iae){
			
		}
		
	}
	
	@Test
	public void test4() {
		test(10);
	}
	
	@Test
	public void test5() {
		test(0);
	}
	
	@Test
	public void test6() {
		test(1);
	}
	
	private void test(int value){	
		try{
			getException(value);
		}catch(IllegalStateException | IllegalArgumentException |  IllegalAccessError ex){
			
		}
	}
	
	
	private void getException(int number){
		
		switch (number){
			case 0:
				throw new IllegalAccessError();
			case 1:
				throw new IllegalArgumentException();
			default:
				throw new IllegalStateException();

		}
		
	}

}
