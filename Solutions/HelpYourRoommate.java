package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpYourRoommate {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while (T-- > 0) {
				int N = Integer.parseInt(br.readLine());
				System.out.println(Integer.bitCount(N));
			}
		} catch (IOException ex) {

		}
	}

}
