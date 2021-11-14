package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println(theQueue(4, "BBGG"));

    }

    public static String theQueue(int n, String s) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == 'B' && s.charAt(j + 1) == 'G') {
                    s = s.substring(0, j) + "GB" + s.substring(j + 2);
                    j++;
                }
            }
        }
        return s;
    }

}
