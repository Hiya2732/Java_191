import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the start of range");
        int start= s.nextInt();

        System.out.println("Enter the end of range");
        int end= s.nextInt();

        System.out.println(max(arr,start, end));

    }

    static int max(int[] array,int start,int end) {


        if(end>start){
            System.out.println("khatam");
        }

        if(array==null){
            return -1;
        }

        int maximum = array[start];
        for (int i = start; i <= end; i++) {
            if (array[i] > maximum) {
                maximum=array[i];
            }
        }
        return maximum;
    }
}