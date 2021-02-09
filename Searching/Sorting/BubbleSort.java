package Searching.Sorting;

import java.util.*;

public class BubbleSort {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int count=0;
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
