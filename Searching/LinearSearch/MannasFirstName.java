package Searching.LinearSearch;

import java.util.*;

public class MannasFirstName {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int count1=0;
        int count2=0;
        while (t-->0) {
            String s = in.nextLine();
            int len = s.length();
            for (int i=0;i<len;i++) {
                if (s.substring(i).startsWith("SUVOJIT"))
                    count1++;
                else if (s.substring(i).startsWith("SUVO"))
                    count2++;
            }
            System.out.println("SUVO = "+ count2+", "+"SUVOJIT = "+count1);
            count1=0;
            count2=0;
        }
    }
}
