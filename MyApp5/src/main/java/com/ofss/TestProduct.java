package com.ofss;

public class TestProduct {

	public static void main(String[] args) {
		System.out.println("Starting the application");
		Stock st1=new Stock(100, "ORCL", 123.4);
		Stock st2=new Stock(101, "IBM", 223.4);
		Stock st3=new Stock(102, "WIPRO", 323.4);
		Stock stocks[]= {st1,st2,st3}; // including all stock objects into stock array
		
		Customer c1=new Customer("Guru", stocks);
		
		System.out.println(c1);
		System.out.println("=========================");
				

	}

}
