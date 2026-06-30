import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        
        boolean found = false;

        for (int i = 0; i < n && !found; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n--- Pair Found! ---");
                    System.out.println("Indices: [" + i + "] and [" + j + "]");
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }

        
        if (!found) {
            System.out.println("\nNo pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}
