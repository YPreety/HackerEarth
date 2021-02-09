package CompetitiveCodingChallenge;

/**
 * 
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array , then the array would become .

Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.
 *  Eg:
 * [1,2,3,4,5] --> [4,5,3,2,1]
 */

import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		String s = scan.nextLine();
		System.out.println(s);
		int a[] = new int[n];
		for (int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		int b[] = new int[n];
        int j = k;
        for (int i=0;i<n;i++){
            if(k<=n){
                b[i]= a[k];
                k++;
            }
            if(k>=n){
            	k=0;
            }
            sb.append(b[i]+" ");
        }
        System.out.println(sb.toString());

	}

}
