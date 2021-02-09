package Searching.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TheBestPlayer {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] st = in.readLine().trim().split(" ");
        int n = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        int[] a = new int[n];
        String[] b = new String[n];
        for (int i=0;i<n;i++) {
            st = in.readLine().split(" ");
            a[i] = Integer.parseInt(st[1]);
            b[i] = st[0];
        }

        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if ((a[j] < a[j + 1]) || a[j]==a[j+1] && b[j].compareTo(b[j+1])>0) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    String name = b[j];
                    b[j]=b[j+1];
                    b[j+1]=name;
                }
            }
        }
        for (int i=0;i<t;i++)
            System.out.println(b[i]);
    }
}
