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
            System.out.println("Krok nr:" + steps+".");
            System.out.println("Szukany element: " + searchedElement);
            System.out.println("Typowany element: " + guess);
            if (guess == searchedElement) {
                System.out.println("Gratulacje! Znalazłeś liczbę");
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
