package com.knoldus;
import java.util.*;
public class Currency{
	public static void main(String args[]){
		System.out.println("Choose the input currency: \n" +
				"1. US Dollars \n" +
				"2. Euros \n" +
				"3. British Pounds \n" +
				"4. Japanese Yen \n" +
				"5. Indian INR \n");
		Scanner in = new Scanner(System.in);
       	int choice = in.nextInt();
		String inType;
		switch(choice) {
			case 1: inType = "US Dollars";  break;
			case 2: inType = "Euros"; break;
			case 3: inType = "British Pounds"; break;
			case 4: inType = "Japanese Yen"; break;
			case 5: inType = "Indian INR"; break;
			default:
			System.out.println("Restart the program & enter a number from the list.");
			return;
		}
		System.out.println("Choose the output currency: \n" +
				"1. US Dollars \n" +
				"2. Euros \n" +
				"3. British Pounds \n" +
				"4. Japanese Yen \n" +
				"5. Indian INR \n");
		int output = in.nextInt();
		System.out.println("Enter the amount in " + inType);
		double input = in.nextDouble();
		if (choice == output) 
        	System.out.println("Same currency no need to convert");

		double rate;

		if (choice == 1 && output == 2)
			{ 
			   double dollar_euro_rate = 0.78391;
			   rate = input * dollar_euro_rate;
			   System.out.printf(input + " Dollars at a conversion rate of " + dollar_euro_rate + " Euros = %.2f\n", rate);
			}
			else if (choice == 1 && output == 3){ 
			   double dollar_pound_rate = 0.621484;
			   rate = input * dollar_pound_rate;
			   System.out.printf(input + " Dollars at a conversion rate of " + dollar_pound_rate + " Pounds = %.2f\n", rate);
			}
			else if (choice == 1 && output == 4){ 
			  double dollar_yen_rate = 107.174;
			  rate = input * dollar_yen_rate;
			  System.out.printf(input + " Dollars at a conversion rate of " + dollar_yen_rate + " Yen = %.2f\n", rate);
			}
			else if (choice == 1 && output == 5){ 
			  double dollar_inr_rate = 71.24;
			  rate = input * dollar_inr_rate;
			  System.out.printf(input + " Dollars at a conversion rate of " + dollar_inr_rate + " INR = %.2f\n", rate);
			}

		if (choice == 2 && output == 1)
		      {
			  double euro_dollar_rate = 1.27579;
			  rate = input * euro_dollar_rate;
			  System.out.printf(input + " Euros at a conversion rate of " + euro_dollar_rate + " Dollars = %.2f\n", rate);
			}
			else if (choice == 2 && output == 3)
			{
			  double euro_pound_rate = 0.792648;
			  rate = input * euro_pound_rate;
			  System.out.printf(input + " Euros at a conversion rate of " + euro_pound_rate + " Pounds %.2f\n", rate);
			}
			else if (choice == 2 && output == 4)
			{
			  double euro_yen_rate = 136.708;
			  rate = input * euro_yen_rate;
			  System.out.printf(input + " Euros at a conversion rate of " + euro_yen_rate + " Yen to %.2f\n", rate);
			}
			else if (choice == 2 && output == 5)
			{
			  double euro_inr_rate = 78.54;
			  rate = input * euro_inr_rate;
			  System.out.printf(input + " Euros at a conversion rate of " + euro_inr_rate + " INR to %.2f\n", rate);
			}

		if (choice == 3 && output == 1)
		      {
			  double pound_dollar_rate = 1.60972;
			  rate = input * pound_dollar_rate;
			  System.out.printf(input + " Pounds at a conversion rate of " + pound_dollar_rate + " Dollars to = %.2f\n", rate);
			}
			else if (choice == 3 && output == 2)
			{
			  double pound_euro_rate = 1.26161;
			  rate = input * pound_euro_rate;
			  System.out.printf(input + " Pounds at a conversion rate of " + pound_euro_rate + " Euros to = %.2f\n", rate);
			}
			else if (choice == 3 && output == 4)
			{
			  double pound_yen_rate = 172.511;
			  rate = input * pound_yen_rate;
			  System.out.printf(input + " Pounds at a conversion rate of " + pound_yen_rate + " Yen to = %.2f\n", rate);
			}
			else if (choice == 3 && output == 5)
			{
			  double pound_inr_rate = 93.04;
			  rate = input * pound_inr_rate;
			  System.out.printf(input + " Pounds at a conversion rate of " + pound_inr_rate + " INR to = %.2f\n", rate);
			}

		if (choice == 4 && output == 1)
		      { 
			  double yen_dollar_rate = 0.00932574;
			  rate = input * yen_dollar_rate;
			  System.out.printf(input + " Yen at a conversion rate of " + yen_dollar_rate + " Dollars to = %.2f\n", rate);
			}
			else if (choice == 4 && output == 2)
			{ 
			  double yen_euro_rate = 0.00730615;
			  rate = input * yen_euro_rate;
			  System.out.printf(input + " Yen at a conversion rate of " + yen_euro_rate + " Euros to = %.2f\n", rate);
			}
			else if (choice == 4 && output == 3)
			{
			  double yen_pound_rate = 0.00579135;
			  rate = input * yen_pound_rate;
			  System.out.printf(input + " Yen at a conversion rate of " + yen_pound_rate + " Pounds to %.2f\n", rate);
			}
			else if (choice == 4 && output == 5)
			{
			  double yen_inr_rate = 0.65;
			  rate = input * yen_inr_rate;
			  System.out.printf(input + " Yen at a conversion rate of " + yen_inr_rate + " INR to %.2f\n", rate);
			}

		if (choice == 5 && output == 1)
		      { 
			  double inr_dollar_rate = 0.014;
			  rate = input * inr_dollar_rate;
			  System.out.printf(input + " INR at a conversion rate of " + inr_dollar_rate + " Dollars to = %.2f\n", rate);
			}
			else if (choice == 5 && output == 2)
			{ 
			  double inr_euro_rate = 0.013;
			  rate = input * inr_euro_rate;
			  System.out.printf(input + " INR at a conversion rate of " + inr_euro_rate + " Euros to = %.2f\n", rate);
			}
			else if (choice == 5 && output == 3)
			{
			  double inr_pound_rate = 0.011;
			  rate = input * inr_pound_rate;
			  System.out.printf(input + " INR at a conversion rate of " + inr_pound_rate + " Pounds to = %.2f\n", rate);
			}
			else if (choice == 5 && output == 4)
			{
			  double inr_yen_rate = 1.53;
			  rate = input * inr_yen_rate;
			  System.out.printf(input + " INR at a conversion rate of " + inr_yen_rate + " Yen to = %.2f\n", rate);
			}
		       System.out.println("Thank you for using the currency converter");

	} 
}

