import algorithm.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] orderedArray = {1, 3, 5, 8, 11, 13, 18, 20, 22};

        Integer res1 = BinarySearch.search(orderedArray, 5);
        Integer res2 = BinarySearch.search(orderedArray, 12);

        System.out.println("Position: " + res1);
        System.out.println("Position: " + res2);

    }
}