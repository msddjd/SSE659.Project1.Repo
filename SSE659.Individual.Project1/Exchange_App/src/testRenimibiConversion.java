import static org.junit.Assert.*;

import org.junit.Test;


public class testRenimibiConversion {

	@Test
	public void testConversion() {
		Renimibi renimibi = new Renimibi(1.00);
		
		renimibi.toDollar();
		assertEquals(0.159612 ,renimibi.dollar, 0);
		
		renimibi.toPound();
		assertEquals(0.103389	, renimibi.pound, 0);
		
		renimibi.toYen();
		assertEquals(19.09, renimibi.yen, 0);
	}

}
