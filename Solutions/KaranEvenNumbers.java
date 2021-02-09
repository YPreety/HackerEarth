package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class KaranEvenNumbers {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		while (scanner.hasNext()) {
			long theNumber = scanner.nextLong();
			if (theNumber == -1) {
				break;
			} else if (theNumber % 2 == 0)
				writer.println(theNumber);
		}

		scanner.close();
		writer.close();
	}

}
