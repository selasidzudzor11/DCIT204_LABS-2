import java.util.Scanner;

public class FindMax {

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

        
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        
        System.out.println("\n--- Result ---");
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Found at Index: " + maxIndex);

        scanner.close();
    }
}
