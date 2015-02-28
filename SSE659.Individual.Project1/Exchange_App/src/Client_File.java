import java.util.*;

public class Client_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option;
		int option2 = 0;
		Dollar dollar = new Dollar();
		Pound pound = new Pound();
		Yen yen = new Yen();
		Renimibi renimibi = new Renimibi();
		
		System.out.println("Welcome to the Currency Exchange App");
		
		System.out.println("\nPlease select which currency to convert:  ");
	
		System.out.println("1. Dollar? "
							+ "\n2. Pound?"
							+ "\n3. Yen?"
							+ "\n4. Renimibi?");
		
		Scanner std = new Scanner(System.in);
		option = std.nextInt();
		
		switch(option){
		case 1: System.out.print("Please input Dollar amount.");
				double amount_d= std.nextDouble();
				System.out.println();
				dollar = new Dollar(amount_d);
				System.out.println(dollar.amount);
				break;
		case 2: System.out.print("Please input Pound amount.");
				double amount_p= std.nextDouble();
				pound = new Pound(amount_p);
				System.out.println(pound.amount);
				System.out.println();
				break;
		case 3: System.out.print("Please input Yen amount.");
				double amount_y= std.nextDouble();
				yen = new Yen(amount_y);
				System.out.println(yen.amount);
				System.out.println();
				break;
		case 4: System.out.print("Please input Renimibi.");
				double amount_r=std.nextDouble();
				renimibi = new Renimibi(amount_r);
				System.out.println(renimibi.amount);
				break;
		default: System.out.println("Option not available!");
		
		}
		
		System.out.println("\n What currency would you like to convert to?");
		
		convertCurrency(option, option2, yen, dollar, pound, renimibi);

	}
	
	public static void convertCurrency(int option, int option2, Yen yen, Dollar dollar, Pound pound, Renimibi renimibi){
		Scanner std2 = new Scanner(System.in);
		
		switch(option){
		case 1: System.out.println("Please select the currency to convert to.");
		System.out.println("1. Pound?"
				+ "\n2. Yen?"
				+ "\n3. Renimibi?");
				option2 = std2.nextInt();
				if(option2 ==1)
					dollar.toPound();
				else if (option2 ==2)
					dollar.toYen();
				else if (option2 ==3)
					dollar.toRenimibi();
				else
					System.out.println("Sorry option not available!");
				
				System.out.println(dollar.amount);
				break;
		case 2: System.out.println("Please select the currency to convert to.");
				System.out.println("1. Dollar?"
						+ "\n2. Yen?"
						+ "\n3. Renimibi?");
				option2 = std2.nextInt();
				if(option2 ==1)
					pound.toDollar();
					else if (option2 ==2)
						pound.toYen();
					else if (option2 ==3)
						pound.toRenimibi();
					else
						System.out.println("Sorry option not available!");
				
				System.out.println(pound.amount);
				break;
		case 3: System.out.println("Please select the currency to convert to.");
				System.out.println("1. Dollar?"
						+ "\n2. Pound?"
						+ "\n3. Renimibi?");
				option2 = std2.nextInt();
				if(option2 ==1)
						yen.toDollar();
					else if (option2 ==2)
						yen.toPound();
					else if (option2 ==3)
						yen.toRenimibi();
					else
						System.out.println("Sorry option not available!");
				
				System.out.println(yen.amount);
				break;
		case 4: System.out.println("Please select the currency to convert to.");
				System.out.println("1. Dollar?"
						+ "\n2. Pound?"
						+ "\n3. Yen?");
				option2 = std2.nextInt();
				if(option2 ==1)
					renimibi.toDollar();
					else if (option2 ==2)
						renimibi.toPound();
					else if (option2 ==3)
						renimibi.toYen();
					else
						System.out.println("Sorry option not available!");
				
				System.out.println(renimibi.amount);
				break;
		default: System.out.println("Option not available!");
		
		}
		
		
	}

	}


