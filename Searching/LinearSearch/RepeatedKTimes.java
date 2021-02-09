package Searching.LinearSearch;

import java.util.*;

public class RepeatedKTimes {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        int k = in.nextInt();
        for (Integer v : map.keySet()) {
            if (map.get(v)==k) {
                System.out.println(v);
                break;
            }
        }
        in.close();
    }
}
