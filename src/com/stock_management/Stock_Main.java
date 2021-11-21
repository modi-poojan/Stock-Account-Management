package com.stock_management;

import java.util.Scanner;

public class Stock_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Stock Market Management");
		Stock_Methods obj = new Stock_Methods();
		System.out.println("Enter how many stocks you want to add ");
		int user_input = scan.nextInt();
		for(int i=1; i <= user_input; i++) {
			obj.buy();
		}
		
		obj.display_portfolio();
		obj.total_val_of_portfolio();
	scan.close();
	}

}
