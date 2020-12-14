package com.method;
 class overload{
	 
	public void get (int prodid, String prodName){
		System.out.println("Product id:"+prodid+"productNmame:"+prodName);
	}
	public void get(double prodPrice){
		System.out.println("product Price"+prodPrice);
	}
 }
 
public class Product {
public static void main(String[] args) {
	
	overload o1 = new overload();
	o1.get(121,"SURAJ");
	o1.get(3653653);
}
}
