import java.util.*;

public class Pound {
	double amount, yen, dollar, renimibi;
	public Pound(){
		
	}
	
	public Pound(double amount){
		this.amount = amount;
	}
	
	public double toYen(){
		yen = amount;
		yen/= 0.005408;
		yen = (float)Math.ceil(yen);	
		amount = yen;
		return amount;
	}
	
	public double  toDollar(){
		dollar = amount;
		dollar/= 0.643383;
		dollar = Math.round(dollar * 100.0)/100.0;
		amount = dollar;
		return amount;
	}
	
	public double toRenimibi(){
		renimibi = amount;
		renimibi/=0.102758;
		renimibi = Math.round(renimibi * 100.0) / 100.0;
		amount = renimibi;
		return amount;
		
	}
}


