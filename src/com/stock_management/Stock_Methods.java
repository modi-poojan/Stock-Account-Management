package com.stock_management;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Methods {

	static ArrayList<Stock_Portfolio> portfolio = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	static public ArrayList<Stock_Portfolio> getPortfolio() {
		return portfolio;
	}

	@SuppressWarnings("static-access")
	public void setPortfolio(ArrayList<Stock_Portfolio> portfolio) {
		 this.portfolio = portfolio;
	}
	
	
	public void enterNumOfStocks() {
		System.out.println("Enter how many stock you want :- ");
		int userChoice = scan.nextInt();
		
		for(int i = 0; i < userChoice; i++) {
			buy_stocks();
		}
	}



	public static void buy_stocks() {
	
		System.out.println("Enter name of the stock");
		String stock_name = scan.next();
		
		System.out.println("Enter quantity of the stock you want to buy ");
		int num_of_stock = scan.nextInt();
		
		System.out.println("Enter price of that stock");
		int stock_price = scan.nextInt();
		
		int total_val = num_of_stock*stock_price;
		
		Stock_Portfolio pass_value = new Stock_Portfolio(stock_name, num_of_stock, stock_price, total_val);
		portfolio.add(pass_value);
		
		System.out.println("Your Choice of Stock added sucessfully");
	}	

	
	public void display_portfolio() {
		
		for(Stock_Portfolio stock_list : portfolio) {
			System.out.println(stock_list.toString());
		}
	}
	
	public  void total_val_of_portfolio() {
		
		int total_val_of_portfolio = 0;
		for (Stock_Portfolio calculate : portfolio) {
			
			total_val_of_portfolio = total_val_of_portfolio + calculate.getTotal_value();
		}
		System.out.println("The total value of your portfolio is = "+total_val_of_portfolio);
	}
	
}

