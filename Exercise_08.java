package bookQuestionsChapter6;

public class Ch6Page235Question8 {

	public static void main(String[] args) {

		System.out.println("Celsius    Fahrenheit     |     Fahrenheit     Celsius");

		for (int i = 40, j = 120; i >= 31; i--, j -= 10) {

			double fahrenheit = celsiusToFahrenheit(i);
			double celsius = fahrenheitToCelsius(j);

			System.out.printf("%-10.1f %-12.1f   |   %7.1f  %13.2f\n", (double) i, fahrenheit, (double) j, celsius);
		}

		System.out.println();

	}

	// Convert from Celsius to Fahrenheit //
	public static double celsiusToFahrenheit(double celsius) {

		return (9.0 / 5) * celsius + 32;
	}

	// Convert from Fahrenheit to Celsius //
	public static double fahrenheitToCelsius(double fahrenheit) {

		return (5.0 / 9) * (fahrenheit - 32);
	}

}
