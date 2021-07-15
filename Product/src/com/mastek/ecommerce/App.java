package com.mastek.ecommerce;
import java.util.Scanner;

import com.mastek.ecommerce.model.Product;


public class App {
	public static void main(String[] args) {
		Product[] productList=new Product[10];//0-9
		//1. Create account
		boolean test=true;
		Scanner sc=new Scanner(System.in);
		Product item=null;
	     int index=0;

		while(test) {
			 System.out.println("Enter product name ");
			 
			 
			 
			 String pName = sc.nextLine();
			 
			 System.out.println("Enter product price");
			 double price  = Double.parseDouble(sc.nextLine());
			 
			 
			 
			System.out.println(index+"Product created\n"+item);
			productList[index]= item;
			index=index+1;
	 System.out.println("Do you want to enter more product y/n?");
	 String choice = sc.nextLine();
	 if(choice.equalsIgnoreCase("n")){
		 test=false;
	 }

			}
		
		sc.close();
		for(int i=0; i<productList.length; i++){
			System.out.println(productList[i]);
		}
		}
		}
			




