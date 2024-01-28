public class Pascal1 {
    public static long pascalTriangle(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

//    public static int pascalTriangle(int r, int c) {
//        int element = (int) nCr(r - 1, c - 1);
//        return element;
//    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        long element = pascalTriangle(r-1, c-1);
        System.out.println("The element at position (r,c) is: " + element);
    }
}