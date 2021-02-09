package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLazyHash {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while (T-- > 0) {
				long N = Long.parseLong(br.readLine());
				int activeDays = Long.bitCount(N);
				System.out.println(activeDays);
			}

		} catch (IOException ex) {

		}
	}

}
