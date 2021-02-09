package Solutions;

import java.util.Scanner;

public class StringSum {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		char[] s = s1.nextLine().toCharArray();

		int weight = 0;
		for (char c : s) {
			weight += ((int) c - 96);
		}

		System.out.println(weight);
	}

}
