import java.util.ArrayList;
import java.util.List;

public class SearchCount {
    public static void main(String[] args) {
        // Given source array
        int[] arr = {2, 4, 2, 6, 2, 8, 2};
        int target = 2; // Value to find

        int count = 0;
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                indices.add(i);
            }
        }

        // Output matching the required task format
        System.out.print("Value found " + count + " times at indices: ");
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i));
            if (i < indices.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}