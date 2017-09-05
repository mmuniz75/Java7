package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinalException {

	@Test
	public void testJava6() {
		try{
			throwException();
		}catch(Exception ex){
			
		}
	}
	
	@Test
	public void testJava7() {
		try{
			throwExceptionJ7();
		}catch(Exception ex){
			
		}
	}
	
	@Test
	public void testJava62() {
		try{
			throwException();
		}catch(IllegalStateException ex){
			
		}
	}
	
	@Test
	public void testJava72() {
		try{
			throwExceptionJ7();
		}catch(IllegalStateException ex){
			
		}
	}
	
	@Test
	public void testX() {
			throwExceptionJ7();
	}
	
	@Test
	public void testX2() {
			throwException();
	}
	
	
	private void throwException(){
		try{
			try{
				new IllegalStateException();
			}catch(Exception ex){
				throw ex; 
			};
			throw new IllegalAccessError();
		}catch(Exception ex){
			
			throw ex;
		}
	}
	
	private void throwExceptionJ7(){
		try{
			
			try{
				new IllegalStateException();
			}catch(Exception ex){
				throw ex; 
			};
			throw new IllegalAccessError();
		}catch(final Exception ex){
			
			throw ex;
		}
	}
	
	
	
}
