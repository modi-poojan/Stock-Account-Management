package com.stock_management;

import java.util.Scanner;

public class Stock_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Stock Market Management");
		StockAccount call = new StockAccount();
		System.out.println("Enter the amount you want to deposit in your account  ");
		double credit_balance = scan.nextInt();
		Account.credit(credit_balance);
		call.userAction();
	scan.close();	
	}

}
