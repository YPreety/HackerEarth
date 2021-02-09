package Searching.LinearSearch;

import java.util.*;


public class SquareTransaction {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            if (i==0)
                arr[i] = in.nextInt();
            else
                arr[i] = in.nextInt() + arr[i-1];
        }
        int q = in.nextInt();
        while (q-->0) {
            int target = in.nextInt();
            int i;
            for (i=0;i<n;i++) {
                if (arr[i]>=target) {
                    System.out.println(i+1);
                    break;
                }
            }
            if (i==n)
                System.out.println(-1);
        }
    }
}
