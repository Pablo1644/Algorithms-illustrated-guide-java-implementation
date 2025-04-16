package problems;

public class BinarySearch {
    public BinarySearch() {}
    public static int binarySort(int searchedElement,int []  table) {
        for (int i = 0; i < table.length; i++) {
            table[i] = i;
        }
        int low = table[0];
        int high = table[99];
        int mid, guess;
        int steps = 0;

        while (low <= high) {
            mid = (low+high)/2;
            guess = table[mid];
            steps++;
            System.out.println("Step no:" + steps+".");
            System.out.println("Searched element: " + searchedElement);
            System.out.println("Typed/calculated element: " + guess);
            if (guess == searchedElement) {
                System.out.println("Yeah! You found it!");
                return mid;
            }
            else if (guess > searchedElement) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
