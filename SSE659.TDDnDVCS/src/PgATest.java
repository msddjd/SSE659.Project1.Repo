import static org.junit.Assert.*;

import org.junit.Test;

public class PgATest {

	@Test
	public void test_g_eq_i() {//Testing the case where g equals i
		EngEconomyCalc mycalc = new EngEconomyCalc();
		double A = 2800000, g = 8.0, i = 8.0;
		int n = 6;
		double correct_answer = 15555555.56;//Found via calculator
		assertEquals(mycalc.findPgGivenA(A,g,i,n),correct_answer,0.01);
	}
	
	@Test
	public void test_g_noteq_i(){
		EngEconomyCalc mycalc = new EngEconomyCalc();
		double A = 2800000, g = 8.0, i = 7.0;
		int n = 6;
		double correct_answer = 2876402.283;
		assertEquals(mycalc.findPgGivenA(A,g,i,n),correct_answer,0.01);
	}

}