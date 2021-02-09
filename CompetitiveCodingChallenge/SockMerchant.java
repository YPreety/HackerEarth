package CompetitiveCodingChallenge;

/*
 * John's clothing store has a pile of  loose socks where each sock  is labeled with an integer,denoting its color. 
 * He wants to sell as many socks as possible, but his customers will only buy them in matching pairs.
 *  Two socks are a single matching pair if .

Given  and the color of each sock, how many pairs of socks can John sell?
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedHashMap<Integer, Integer> contents = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			int sock = scan.nextInt();
			if(contents.get(sock)==null){
				contents.put(sock, 1);
			}else{
				int val =contents.get(sock);
				contents.put(sock, val+1);
			}
		}

		Iterator it = contents.entrySet().iterator();
		int pairs = 0;
		while(it.hasNext()){
			Map.Entry pair = (Entry) it.next();
			int value = (Integer)pair.getValue();
			pairs += (value/2);				
		}
		System.out.println(pairs);
	}
}
