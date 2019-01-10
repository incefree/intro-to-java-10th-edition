package bookQuestionsChapter6;

import java.util.Scanner;

public class Ch6Page235Question7 {

	public static void main(String[] args) {
		// For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.

		Scanner input = new Scanner(System.in);
		System.out.println("The amount invested: ");
		double investmentAmount = input.nextDouble();
		System.out.println("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.println("Years     Future Value");

		for (int i = 1; i <= 10; i++) {

			double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
			System.out.printf("%-5d  %12.2f\n", i, futureValue);
		}
		System.out.println();
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

	}
}
