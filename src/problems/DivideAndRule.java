package problems;

import java.util.Arrays;

public class DivideAndRule {
    // short exercise before writing quick sort
    static int sum=0;
    static int index = 1;
    public static int countSumByDivideAndRule(int arr[]) {
        if (arr.length == 1) return sum+arr[0];
        sum+= arr[0];
        arr = slice(arr, index,arr.length);
        return countSumByDivideAndRule(arr);
    }
    public static void showInfoOfDivideAndRule(int arr[]) {
        System.out.println("SUM:"+countSumByDivideAndRule(arr));
    }
    static int[] slice(int[] arr, int start, int end) {
        if (start < 0 || end > arr.length || start > end) {
            throw new IllegalArgumentException("Invalid index range.");
        }
        int[] res = new int[end - start];
        for (int i = start; i < end; i++) {
           res[i - start] = arr[i];
        }
        return res;
    }
}
