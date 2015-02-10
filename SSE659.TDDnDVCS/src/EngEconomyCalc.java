public class EngEconomyCalc {
			
	double findPgGivenA(double A, double g, double i, int n){
				
		return (A*(n/(1+i/100.00)));		
		
	}
}

//return Math.round( (A*(n/(1+i/100.00)))*10000.0/10000.0 );