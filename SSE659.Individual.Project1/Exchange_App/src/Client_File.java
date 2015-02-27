import java.util.*;

public class Client_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option;
		int option2;
		
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
				Dollar dollar = new Dollar(amount_d);
				break;
		case 2: System.out.print("Please input Pound amount.");
				double amount_p= std.nextDouble();
				System.out.println();
				break;
		case 3: System.out.print("Please input Yen amount.");
				double amount_y= std.nextDouble();
				System.out.println();
				break;
		case 4: System.out.print("Please input Renimibi.");
				double amount_r=std.nextDouble();
		default: System.out.println("Option not available!");
		
		}

	}

	}


