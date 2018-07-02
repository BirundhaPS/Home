package com.hdfc.loans.homeloans;

public class Home {

	int a = 10 , b=15 , c;
	public void Multiply() {
		c = a*b;
		System.out.println("Multiply amount is:{c}" );
	}
	public static void main(String[] args) {
		Home obj =new Home();
		obj.Multiply();	

	}

}
