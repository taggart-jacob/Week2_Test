package com.example.week2_test;

public class SubstringsOrdered {

    public static void main(String args[]) {
        String frog = "Frog";
        subStringsOrder(frog, "");
    }

    public static void subStringsOrder(String orig, String iterate) {
        if (orig.length() == 0) {

            System.out.println(iterate);
            return;
        }
        subStringsOrder(orig.substring(1), iterate + orig.substring(0, 1));

        subStringsOrder(orig.substring(1), iterate);
    }
}