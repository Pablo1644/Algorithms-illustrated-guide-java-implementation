import problems.BinarySearch;
import problems.DivideAndRule;
import problems.SelectionSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 1. Binary search
        BinarySearch.binarySort(23,new int[123]);
        // 2. Selection sort
        SelectionSort.selectionSort(new ArrayList<>(List.of(1,2,1,928,16,5,0,17)));
        DivideAndRule.showInfoOfDivideAndRule(new int[] {15,6,23,1600});

    }
}