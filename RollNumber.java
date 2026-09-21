public class RollNumber {
    
    // Linear search method to find the index of key in array a
    static int rollSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i; // Found key, return index
            }
        }
        return -1; // Checked all elements, key not found
    }

    public static void main(String[] args) {
        int[] rolls = {101, 205, 309, 412, 560, 678};

        // Search for 412
        int index = rollSearch(rolls, 412);
        
        if (index != -1) {
            System.out.println("412 found at index: " + index);
        } else {
            System.out.println("Not Found");
        }

        // Optional check for an element not in the array
        int search100 = rollSearch(rolls, 100);
        System.out.println("Search 100 result: " + search100);
    }
}