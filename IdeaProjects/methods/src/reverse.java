import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int[] arr={1,4,5,23,54,19};
        rev(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }




}




