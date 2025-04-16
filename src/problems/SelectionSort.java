package problems;

import java.util.ArrayList;

public class SelectionSort {

    static int findSmallestIndex(ArrayList<Integer> unsortedList) {
        int min = unsortedList.getFirst();
        int smallestIndex = 0;
        for (int i = 0; i < unsortedList.size(); i++) {
            if (min > unsortedList.get(i)) {
                min = unsortedList.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    // Can be not void
    public static void selectionSort(ArrayList<Integer> unsortedList) {
        ArrayList <Integer> sortedList = new ArrayList <>();
        ArrayList<Integer> unsortedCopy = new ArrayList<>(unsortedList);
        for (int i = 0; i < unsortedList.size(); i++) {
            int indexOfSmallestElem = findSmallestIndex(unsortedCopy);
            sortedList.add(unsortedCopy.remove(indexOfSmallestElem));
        }
        System.out.println("Not the fastest algorithm - done for educational purpose");
        System.out.println("Unsorted List: " + unsortedList);
        System.out.println("Sorted List: " + sortedList);
    }
}
