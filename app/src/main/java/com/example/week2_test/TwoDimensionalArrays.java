package com.example.week2_test;

import java.util.HashSet;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        String[][] strArray = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "a", "b",}};
        hasDuplicatesInRows(strArray);

    }

    public static void hasDuplicatesInRows(String[][] strArray) {

        HashSet<String> hashElements = new HashSet<>();
        String c;
        String d;
        //x
        for (int i = 0; i < strArray.length; i++) {
            //y
            for (int j = 0; j < strArray[i].length; j++) {
                //x
                for (int k = 0; k < strArray.length; k++) {
                    //y
                    for (int l = 0; l < strArray[k].length; l++) {
                        //x, y.....x, y
                        if (strArray[i][j].equals(strArray[k][l])) {
                            //x, x....y, y
                            if ((i != k) && (j != l)) {
                                //pair x, y
                                c = "{" + i + ", " + j + "}";
                                //pair x, y
                                d = "{" + k + ", " + l + "}";
                                hashElements.add(c);
                                hashElements.add(d);

                            }
                        }

                    }
                }
            }
        }
        //prints out...unsure on structuring of output
        System.out.print(hashElements);
    }
}