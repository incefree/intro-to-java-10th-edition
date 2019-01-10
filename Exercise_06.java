package bookQuestionsChapter6;

import java.util.Scanner;

public class Ch6Page235Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		displayPattern(input.nextInt());

	}

	public static void displayPattern(int n) {

		for (int line = 1; line <= n; line++) {
			for (int i = n - line; i >= 1; i--) {
				System.out.print("  ");
			}
			for (int j = line; j >= 1; j--) {
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
	}
}
