package za.co.vendingMachine;

import java.util.Scanner;

import za.co.vendingMachine.read.ReadFile;
import za.co.vendingMachine.validate.ValidateQuantity;

public class Main {
	public static void main(String arg[]) throws Exception {
		
		System.out.println("Enter Coin/Note for purchase..");
		Scanner scan = new Scanner(System.in);
		ReadFile read = new ReadFile();
		ValidateQuantity stock = new ValidateQuantity();
		
		int cash = scan.nextInt();
		int product = 0;
		
		if (cash > 0) {
			
			System.out.println("********Available Products********");
//			String[] selected = read.readfile();
//			
//			System.out.println("Please select product :");
//			int product = scan.nextInt();
//			
//			selected[0];
			ValidateQuantity.availabillty(product);
			
			
		}else {
			System.out.println("********Insufficient funds********");
			System.exit(-1);
		}
		
		
		
	}

}
