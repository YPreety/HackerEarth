package CompetitiveCodingChallenge;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int count =0;
        int height_max = 0;
        for(int i=0;i<n;i++){
            if(height[i]==height_max){
            	count ++;
            }else if (height[i]>height_max){
            	count = 1;
            	height_max= height[i];
            }
        }
        System.out.println(count);
    }
}
