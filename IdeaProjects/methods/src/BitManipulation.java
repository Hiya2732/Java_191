import java.util.Scanner;

public class BitManipulation {

    // Function to find the minimum possible value of X
    static int findMinimumX(int A, int B, int C) {
        for (int i = 0; i <= 109; i++) {
            if (((A | i) & (B | i)) == C) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result = findMinimumX(A, B, C);

        System.out.println(result);
    }
}