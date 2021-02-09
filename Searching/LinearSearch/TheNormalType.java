package Searching.LinearSearch;

import java.util.*;

public class TheNormalType {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		HashSet<Integer> set = new HashSet<>();
		int last = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if (set.add(arr[i]))
				last = i;
		}
		System.out.println(last);
		long count = 1 + (n - last - 1);
		int start = 0;
		int end = last;
		while (start < n && end < n) {
			int temp = arr[start];
			int i = start + 1;
			for (; i < n; i++) {
				if (arr[i] == temp)
					break;
			}
			if (i >= n)
				break;
			if (i > end)
				end = i;
			start++;
			count = count + 1 + (n - end - 1);
		}
		System.out.println(count);
	}
}
