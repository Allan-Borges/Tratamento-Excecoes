package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptionss.ExceptionBusiness;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Account acc = new Account("Allan", 500.00, 2120, 600.0);
		System.out.println(acc.getBanlance());
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
	
		try {
		acc.withdraw(amount);		
		}
		catch(ExceptionBusiness e) {
			System.out.println(e.getMessage());
		}
		System.out.println(acc.getBanlance());
		sc.close();
	}
}
