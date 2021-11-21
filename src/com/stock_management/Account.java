package com.stock_management;

import java.util.Scanner;

public class Account {

	int current_balance = 0;
	static Scanner scan = new Scanner(System.in);
	
	public void debit() {
		
		System.out.println("Enter the amount you want to debit");
		int withdraw_amount = scan.nextInt();
		if(withdraw_amount > current_balance) {
			System.out.println("Entered amount "+withdraw_amount+" exceeded account balance.");
			System.out.println("Current account balance remains unchanged = "+ current_balance);
		}
		else {
			System.out.println("Current account balance debiting = "+current_balance);
			current_balance = current_balance - withdraw_amount;
			System.out.println("Current account balance after debiting is = "+ current_balance);
		}
	}
		
	public void credit() {
		
		System.out.println("Enter the amount you want to credit");
		int deposit_amount = scan.nextInt();
		System.out.println("Current account balance before crediting = "+current_balance );
		current_balance += deposit_amount; 
		System.out.println("Current account balance after crediting = "+current_balance );
	}
		
		
	
}
