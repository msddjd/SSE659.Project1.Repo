import java.util.*;

public class Yen {
	
	double amount, dollar, pound, renimibi;
	
	public Yen(){
		
	}
	
	public Yen(double amount){
		this.amount = amount;
	}

	public double toPound(){
		pound= amount;
		pound/= 184.054310;
		pound = Math.round(pound * 1000000.0)/1000000.0;	
		amount = pound;
		return amount;
	}
	
	public double  toDollar(){
		dollar = amount;
		dollar/= 119.232038;
		dollar = Math.round(dollar * 1000000.0)/1000000.0;
		amount = dollar;
		return amount;
	}
	
	public double toRenimibi(){
		renimibi = amount;
		renimibi/=19.021566;
		renimibi = Math.round(renimibi * 1000000.0) / 1000000.0;
		amount = renimibi;
		return amount;
		
	}
}
