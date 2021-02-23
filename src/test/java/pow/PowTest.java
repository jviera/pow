package pow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.vieracode.pow.util.Util;

class PowTest {

	@Test
	void powTest() {
		Assertions.assertEquals(Math.pow(2, 3), Util.pow(2, 3));	
	
	}
	
	@Test
	void powTest2() {
		Assertions.assertEquals(Math.pow(3, 4), Util.pow(3, 4));		
	}
	
	@Test
	void powTest3() {
		Assertions.assertEquals(Math.pow(4, 5), Util.pow(4, 5));		
	}
	
	@Test
	void powTest4() {
		Assertions.assertNotEquals(Math.pow(4, 5), Util.pow(5, 4));		
	}

}
