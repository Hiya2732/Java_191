import java.util.*;

class trial {

    static void fun(int A[]){
        int max=A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] <max) {
                max = A[i]; // Update max if a larger value is found
                System.out.println(max);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size");
        int size = s.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        fun(arr);
    }

}