package com.mastek.bankapp.SerBankApp;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerBankApp {

	public static void main(String[] args) {

			BankApp p1 = new BankApp(1001, "Ajit", 2000);
			// Step 1. we need file
//			try {
//				FileOutputStream fos=new FileOutputStream("person.txt");
//				ObjectOutputStream oos=new Object
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			try (FileOutputStream fos = new FileOutputStream("bankApp.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(p1);

			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}

		// TODO Auto-generated method stub

	}


