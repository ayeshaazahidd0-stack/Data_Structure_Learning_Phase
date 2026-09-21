public class CountOccurrences {

    // Binary search helper to find the first position of the target
    static int findFirst(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // Search left half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    // Binary search helper to find the last position of the target
    static int findLast(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // Search right half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        // Given sorted array
        int[] arr = {2, 4, 4, 4, 6, 6, 8, 8, 8, 8};
        int target = 8;

        int firstIndex = findFirst(arr, target);
        int lastIndex = findLast(arr, target);
        if (firstIndex != -1 && lastIndex != -1) {
            // Calculate total occurrences using indices
            int count = lastIndex - firstIndex + 1;
            System.out.println("Value " + target + " found " + count + " times from index " + firstIndex + " to " + lastIndex);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
}