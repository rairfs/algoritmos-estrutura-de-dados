package algorithm;

public class BinarySearch {

    public static Integer search(int[] orderedArray, int key) {
        int low = 0;
        int high = orderedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (orderedArray[mid] == key) {
                return mid;
            } else if (orderedArray[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}
