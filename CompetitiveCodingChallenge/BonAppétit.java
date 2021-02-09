package CompetitiveCodingChallenge;

/*
 * Anna and Brian order  items at a restaurant, but Anna declines to eat any of the  item (where ) due to an allergy. 
 * When the check comes, they decide to split the cost of all the items they shared; 
 * however, Brian may have forgotten that they didn't split the  item and accidentally charged Anna for it.

You are given the cost of each of the  items, and the total amount of money that Brian charged Anna for her portion of the bill. 
If the bill is fairly split, print Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna.
 * 
 * 
 */
import java.util.Scanner;

public class BonAppétit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int actualShare =0;
		for(int i =0 ; i < n;i++){
			if(i !=k){
				int temp =scan.nextInt();
				actualShare +=temp;
			}else{
				scan.nextInt();
			}
		}
		int ch = scan.nextInt();
		if (actualShare/2 == ch){
			System.out.println("Bon Appetit");
		}else{
			System.out.println(ch-(actualShare/2));
		}
	}

}
