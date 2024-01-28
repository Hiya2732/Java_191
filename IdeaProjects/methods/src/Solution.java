import java.util.Scanner;

public class Solution {

    public float calculate_fuel_consumed(int[] fuel_array, int size_of_array, int fuel_price) {
        float total_fuel_consumed = 0;

        // Calculate total fuel consumed
        for (int i = 0; i < size_of_array; i++) {
            total_fuel_consumed += fuel_array[i];
        }

        // Calculate average fuel consumed
        return total_fuel_consumed / (size_of_array * fuel_price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        // Get user input
        System.out.print("Enter size of array: ");
        int size_of_array = scanner.nextInt();

        int[] fuel_array = new int[size_of_array];
        System.out.println("Enter fuel values in the array:");
        for (int i = 0; i < size_of_array; i++) {
            System.out.print("Fuel value " + (i + 1) + ": ");
            fuel_array[i] = scanner.nextInt();
        }

        System.out.print("Enter fuel price: ");
        int fuel_price = scanner.nextInt();

        // Calculate and display result
        float result = solution.calculate_fuel_consumed(fuel_array, size_of_array, fuel_price);
        System.out.println("Average fuel consumed: " + result);
    }
}