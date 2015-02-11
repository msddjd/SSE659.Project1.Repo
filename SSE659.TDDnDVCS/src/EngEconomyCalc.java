public class EngEconomyCalc {
			
	double findPgGivenA(double A, double g, double i, int n){
		if(g==i)		
		return (A*(n/(1+i/100.00)));
		else
		return A*(1 - Math.pow( ((1+g)/(1+i)), n ))/(i-g);
	}	
}