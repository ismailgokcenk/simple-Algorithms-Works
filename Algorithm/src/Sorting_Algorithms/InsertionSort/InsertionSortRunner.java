package Sorting_Algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSortRunner {

    public static void main(String[] args) {

        int[] arr = {12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("Before InsertionSort  Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        System.out.println("After InsertionSort Array :");
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
