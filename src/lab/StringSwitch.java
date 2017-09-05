package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringSwitch {

	
	enum CAR_CATEGORY{
		HATCHBACK,
		STATION_WAGON,
		SEDAN,
		SUV,
		OTHER
	}
	
	
	@Test
	public void testHatch() {
		assertEquals(getCarCategory("Golf"),CAR_CATEGORY.HATCHBACK);
	}
	
	@Test
	public void testStaionWagon() {
		assertEquals(getCarCategory("Variant"),CAR_CATEGORY.STATION_WAGON);
	}
	
	@Test
	public void testSedan() {
		assertEquals(getCarCategory("Passat"),CAR_CATEGORY.SEDAN);
	}
	
	@Test
	public void testSUV() {
		assertEquals(getCarCategory("Tourang"),CAR_CATEGORY.SUV);
	}
	
	@Test
	public void testOther() {
		assertEquals(getCarCategory("sdfds"),CAR_CATEGORY.OTHER);
	}
	
	private CAR_CATEGORY getCarCategory(String value){
		
		CAR_CATEGORY result = null;
		switch (value){
			case "Golf":
				result = CAR_CATEGORY.HATCHBACK;
				break;
			case "Variant":
				result = CAR_CATEGORY.STATION_WAGON;
				break;
			case "Passat":
				result = CAR_CATEGORY.SEDAN;
				break;
			case "Tourang":
				result = CAR_CATEGORY.SUV ;
				break;
			default :
				result = CAR_CATEGORY.OTHER;
				break;
		}
		return result;
		
	}

}
