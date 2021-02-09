package CompetitiveCodingChallenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MonkandPhilosopherStone {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] con = br.readLine().split(" ");
		String values[] = br.readLine().split(" ");
		Stack<Object> monkBag = new Stack<>();
		int harryBag =0;
		int sum =0;
		boolean check = true;
		for(int i=0 ; i< Integer.parseInt(values[0]) ; i++){
			if(br.readLine().equalsIgnoreCase("Harry")){
				int value = Integer.parseInt(con[harryBag]);
				monkBag.push(value);
				sum+=value;
				harryBag++;
			}else {
				int val = (int) monkBag.pop();
				sum-=val;
			}
			if(sum == Integer.parseInt(values[1])){
				check = false;
				System.out.println(monkBag.size());
				break;
			}
		}
		if(check){
			System.out.println("-1");
		}
	}
}
