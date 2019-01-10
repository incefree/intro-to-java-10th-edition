package bookQuestionsChapter6;

public class Ch6Page236Question9 {

	public static void main(String[] args) {
		System.out.println("Feet       Meters        |         Meters     Feet");
		// i = feet, j = meters
		for (double i = 1.0, j = 20.0; i <= 10; i++, j += 5) {
			double meters = footToMeter(i);
			double feet = meterToFoot(j);
			
			System.out.printf("%-10.1f %-10.3f    |    %9.1f  %12.3f\n", i, meters, j, feet);
			
		}
		System.out.println();
		
		
	}
	//Convert from feet to meters 
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	//Convert from meters to feet 
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}
