package bookQuestionsChapter7;

// Write a program that generates the integers between 1 and 100 and counts the occurrences of each.
public class Ch7Page277Question3 {

	public static void main(String[] args) {

		int[] counts = new int[100];

		for (int i = 0; i < 100; i++) {
			counts[(int) (Math.random() * 100) + 1]++;
		}
		System.out.print("Enter the integers between 1 and 100: ");

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
			}
		}
	}
}
