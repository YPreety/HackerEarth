package CompetitiveCodingChallenge;

import java.util.Scanner;

public class BreakingtheRecords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for(int score_i=0; score_i < n; score_i++){
			score[score_i] = in.nextInt();
		}
		int best = 0;
		int worst = 0;
		int seasonStart_best = score[0];
		int seasonStart_worst = score[0];
		for(int i=1;i<n;i++){
			if(score[i]>seasonStart_best ){
				best++;
				seasonStart_best = score[i];
			}				
			else if (score[i]<seasonStart_worst ){
				worst++;	
				seasonStart_worst = score[i];
			}
		}
		System.out.println(best + " "+ worst);
	}
}
