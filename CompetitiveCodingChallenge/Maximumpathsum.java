/**
https://www.hackerrank.com/contests/projecteuler/challenges/euler067/problem
**/

package CompetitiveCodingChallenge;

import java.util.Scanner;

public class MaximumpathsumI {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int k=0;k<n;k++){
			int size = scan.nextInt();
			int [][] a = new int[size][size];
			int [][] b = new int[size][size];
			int max =0;
			for(int i=0;i<size;i++){
				for(int j=0;j<=i;j++){
					a[i][j] = scan.nextInt();
				}
			}			
			for(int i=0;i<size;i++){
				for(int j=0;j<=i;j++){
					if(i== 0 && j==0)
						b[i][j]=a[i][j];
					else if (j==0 && i>0 )
						b[i][j]= a[i][j]+b[i-1][j];
					else if(i==j)
						b[i][j] = a[i][j]+b[i-1][j-1];
					else{
						int first =  a[i][j]+b[i-1][j-1];
						int second = a[i][j]+b[i-1][j];
						b[i][j] = first>second?first:second;
					}
						
					max = max>b[i][j]?max:b[i][j];
				}
			}
			System.out.println(max);
		}		
	}
}
