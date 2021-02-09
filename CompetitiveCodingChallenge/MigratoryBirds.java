package CompetitiveCodingChallenge;

/**
 * A flock of  birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers
   Given an array of  integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird.
   If two or more types of birds are equally common, choose the type with the smallest ID number.
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds {
	
	public static void main(String [] arg){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedHashMap<Integer, Integer> contents = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			int bird = scan.nextInt();
			if(contents.get(bird)==null){
				contents.put(bird, 1);
			}else{
				int val =contents.get(bird);
				contents.put(bird, val+1);
			}
		}
		Iterator it = contents.entrySet().iterator();
		int birdNum = 0;
		int birdValue =0;
		while(it.hasNext()){
			Map.Entry pair = (Entry) it.next();
			if(birdValue == (Integer)pair.getValue()){
				if(birdNum > (Integer) pair.getKey()){
					birdNum = (Integer) pair.getKey();
				}
			}else if(birdValue < (Integer)pair.getValue()){
				birdValue = (Integer) pair.getValue();
				birdNum = (Integer) pair.getKey();
			}
		}
		System.out.println(birdNum);
	}

}
