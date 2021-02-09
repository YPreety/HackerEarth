package CompetitiveCodingChallenge;
// https://www.hackerrank.com/contests/codeagon/challenges/subsequence-3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String subsequenceAgain(String seq, int max) {
        // Complete this function
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for(int i=0;i<seq.length();i++){
			if(chars.get(seq.charAt(i))==null)
				chars.put(seq.charAt(i), 1);
			else
				chars.put(seq.charAt(i), chars.get(seq.charAt(i))+1);
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<seq.length();i++){
			if(chars.get(seq.charAt(i))>=max)
				sb.append(seq.charAt(i));
		}
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String result = subsequenceAgain(s, k);
        System.out.println(result);
        in.close();
    }
}
