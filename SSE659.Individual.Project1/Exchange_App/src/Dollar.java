import java.util.*;

public class Dollar {
	
	double amount, yen, pound, renimibi;
	
	public Dollar(){
		
	}

	public Dollar(double amount){
		this.amount=amount;
	}
	
	public double toYen(){
		yen = amount;
		yen/= 0.008411;
		yen = (float)Math.ceil(yen);	
		amount = yen;
		return amount;
	}
	
	public double  toPound(){
		pound = amount;
		pound/= 1.552453;
		//pound = (float)Math.ceil(pound);
		pound = Math.round(pound * 1000000.0) / 1000000.0;
		amount = pound;
		return amount;
	}
	
	public double toRenimibi(){
		renimibi = amount;
		renimibi/=0.159695;
		renimibi = Math.round(renimibi * 100.0) / 100.0;
		amount = renimibi;
		return amount;
		
	}
}
