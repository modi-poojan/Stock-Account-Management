package com.stock_management;

public class Stock_Portfolio {
	
	public String stock_name;
	public int num_of_stock;
	public int stock_price;
	public int total_value;
	
	public Stock_Portfolio(String stock_name, int num_of_stock, int stock_price, int total_value) {
		super();
		this.stock_name = stock_name;
		this.num_of_stock = num_of_stock;
		this.stock_price = stock_price;
		this.total_value = total_value;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public int getNum_of_stock() {
		return num_of_stock;
	}

	public void setNum_of_stock(int num_of_stock) {
		this.num_of_stock = num_of_stock;
	}

	public int getStock_price() {
		return stock_price;
	}

	public void setStock_price(int stock_price) {
		this.stock_price = stock_price;
	}

	public int getTotal_value() {
		return total_value;
	}

	public void setTotal_value(int total_value) {
		this.total_value = total_value;
	}

	@Override
	public String toString() {
		return ("Stock_name=" + getStock_name() + "\nnum_of_stock=" + getNum_of_stock() + "\nstock_price="+ getStock_price() + "\ntotal_value=" + getTotal_value());
	}
	
	

}
