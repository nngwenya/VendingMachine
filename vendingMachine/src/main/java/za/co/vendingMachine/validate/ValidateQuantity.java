package za.co.vendingMachine.validate;

import java.util.Scanner;

import za.co.vendingMachine.read.ReadFile;
import za.co.vendingMachine.vending.Vending;

public class ValidateQuantity {
	
	public static void availabillty(int product) throws Exception {
		Vending v = new Vending();
		
		ReadFile read = new ReadFile();
		String[] str = read.readfile();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please select product :");
		
		product = scan.nextInt();
		
		v.setKey(product);
	v.setFood(str[1]);
	
		System.out.println("Selected: " + v.getFood());
//		
//		if (Integer.parseInt(str[2]) < 0) {
//			System.out.println("Sorry pruduct unavailable, please select again!");
//			
//		}else
//		{
//			quantity =Integer.parseInt(str[2]) - 1;
//		}
	}
	

}
