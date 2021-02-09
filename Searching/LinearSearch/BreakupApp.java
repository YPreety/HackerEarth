package Searching.LinearSearch;

import java.util.Scanner;

public class BreakupApp {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int countDate = 0;
        int noDate = 0;
        while (t-->0){
            String s = in.nextLine();
            if (s.contains("M:")) {
                if (s.contains("19"))
                    countDate= countDate+1;
                if (s.contains("21"))
                    noDate=noDate+1;
            }
            if (s.contains("G:")) {
                if (s.contains("19"))
                    countDate= countDate+2;
                if (s.contains("21"))
                    noDate=noDate+2;
            }
        }
        System.out.println(countDate<=noDate?"No Date":"Date");
    }
}
