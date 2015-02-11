import static org.junit.Assert.*;

import org.junit.Test;

public class PgATest {
	
	EngEconomyCalc mycalc = new EngEconomyCalc();
	double A, g, i, correct_answer;
	int n;

	@Test
	public void test_g_eq_i() {//Testing the case where g equals i
		
		A = 2800000;
		g = 8.0;
		i = 8.0;
		n = 6;
		correct_answer = 15555555.56;//Found via calculator
		assertEquals(mycalc.findPgGivenA(A,g,i,n),correct_answer,0.01);
	}
	
	@Test
	public void test_g_noteq_i(){		
		A = 2800000;
		g = 8.0;
		i = 7.0;
		n = 6;
		correct_answer = 2876402.283;
		assertEquals(mycalc.findPgGivenA(A,g,i,n),correct_answer,0.01);
	}
}