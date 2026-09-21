import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take size input
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // 2. Declare and initialize array
        int[] arr = new int[n];

        // 3. Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 4. Initialize min AFTER populating/declaring array
        int min = arr[0];

        // 5. Find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 6. Display the result
        System.out.println("Minimum = " + min);

        sc.close();
    }
}