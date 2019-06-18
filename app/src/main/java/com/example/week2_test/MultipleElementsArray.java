package com.example.week2_test;

import java.util.Arrays;

public class MultipleElementsArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 3, 5, 1, 8, 7, 9, 7, 8, 9};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}