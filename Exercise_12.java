package bookQuestionsChapter6;

public class Ch6Page237Question_12 {

	public static void main(String[] args) {
		// (Display characters)
		printChars('1', 'Z', 10);

	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {

		for (int count = 1; ch1 <= ch2; count++, ch1++) {
			System.out.print(ch1 + " ");
			if (count % numberPerLine == 0) {
				System.out.println();
			}
		}
	}
}
