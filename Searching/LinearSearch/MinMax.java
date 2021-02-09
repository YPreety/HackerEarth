package Searching.LinearSearch;

import java.util.Scanner;

public class MinMax {
    public static void main (String[] args) {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if (max<arr[i]) max=arr[i];
            if (min>arr[i]) min=arr[i];
            sum+=arr[i];
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}
