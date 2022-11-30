package com.main;


import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
    Format currency = NumberFormat.getCurrencyInstance(Locale.US);
        Object us = currency.format(payment);
        
    String india =  NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
    
    Format currency2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Object china = currency2.format(payment);
        
    Format currency3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Object france = currency3.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
}
