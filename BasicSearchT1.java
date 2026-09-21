public class BasicSearchT1 {

    static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                return mid; // Found key, return index
            } else if (a[mid] < key) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        // Given sorted array
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("Index of " + key + ": " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}