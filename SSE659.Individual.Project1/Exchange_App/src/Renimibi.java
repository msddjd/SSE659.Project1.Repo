import java.util.*;

public class Renimibi {
	
	double amount, yen, dollar, pound;
	
	public Renimibi(){
		
	}
	
	public Renimibi(double amount){
		this.amount = amount;
	}

	public double toYen(){
		yen = amount;
		yen/= 0.052374;
		yen=Math.round(yen*100.0)/100.0	;
		amount = yen;
		return amount;
	}
	
	public double  toDollar(){
		dollar = amount;
		dollar/= 6.265200;
		dollar = Math.round(dollar * 1000000.0)/1000000.0;
		amount = dollar;
		return amount;
	}
	
	public double toPound(){
		pound = amount;
		pound/=9.672215;
		pound = Math.round(pound * 1000000.0) / 1000000.0;
		amount = pound;
		return amount;
		
	}
}
