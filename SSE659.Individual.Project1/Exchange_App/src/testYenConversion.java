import static org.junit.Assert.*;

import org.junit.Test;


public class testYenConversion {

	@Test
	public void testConversion() {
		Yen yen = new Yen(1.00);
		
		yen.toDollar();
		assertEquals(0.008387 ,yen.dollar, 0);
		
		yen.toPound();
		assertEquals(0.005433	, yen.pound, 0);
		
		yen.toRenimibi();
		assertEquals(0.052572, yen.renimibi, 0);
	}

}

