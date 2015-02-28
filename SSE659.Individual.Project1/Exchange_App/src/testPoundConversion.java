import static org.junit.Assert.*;

import org.junit.Test;


public class testPoundConversion {

	@Test
	public void testConversion() {
		Pound pound = new Pound(1.00);
		
		pound.toDollar();
		assertEquals(1.55 ,pound.dollar, 0);
		
		pound.toYen();
		assertEquals(185.00, pound.yen, 0);
		
		pound.toRenimibi();
		assertEquals(9.73, pound.renimibi, 0);
	}

}
