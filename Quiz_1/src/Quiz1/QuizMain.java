package Quiz1;

import java.util.Scanner;

public class QuizMain {

	public static void qbmeasure(){ 
		Scanner inter = new Scanner(System.in);
		System.out.println("Enter number of Interceptions: ");
		int intercept = inter.nextInt();
		Scanner tds = new Scanner(System.in);
		System.out.println("Enter number of Touchdown: ");
		int TDs = tds.nextInt();
		Scanner yrds = new Scanner(System.in);
		System.out.println("Enter number of yards: ");
		double yards = yrds.nextDouble();
		Scanner comp = new Scanner(System.in);
		System.out.println("Enter number of completions: ");
		int completions = comp.nextInt();
		Scanner att = new Scanner(System.in);
		System.out.println("Enter number of attempts: ");
		int ATT = att.nextInt();
		double a = 5*((completions/ATT)-.3);
		double b = .25*((yards/ATT)-3);
		double c = 20* (TDs/ATT);
		double d = 2.375 - ((intercept/ATT)*25);
		if (a > 2.375 );{
			a = 2.375; }
		if (b > 2.375 );{
			b = 2.375; }
		if (c > 2.375 );{
			c = 2.375; }
		if (d > 2.375 );{
			d = 2.375; }
		if (a < 0 );{
			a = 0; }
		if (b < 0 );{
			b = 0; }
		if (c < 0 );{
			c = 0; }
		if (d < 0 );{
			d = 0; }
		double pass_rating = ((a + b + c + d)/6)*100;
		System.out.println("The passer rating is " + pass_rating);
		
		}
		
				
		
	}


