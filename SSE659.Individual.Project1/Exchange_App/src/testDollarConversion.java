import static org.junit.Assert.*;

import org.junit.Test;


public class testDollarConversion {

	@Test
	public void testConversion() {
		Dollar dollar = new Dollar(1.00);
		
		dollar.toYen();
		assertEquals(119.0 ,dollar.yen, 0);
		
		dollar.toPound();
		assertEquals(0.644142, dollar.pound, 0);
		
		dollar.toRenimibi();
		assertEquals(6.26, dollar.renimibi, 0);
	}

}
