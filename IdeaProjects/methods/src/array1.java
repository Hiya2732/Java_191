
import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
            int[] arr=new int[n];

           for(int i=0;i<arr.length;i++){
              arr[i]=s.nextInt();
       }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
     }
//            System.out.println(Arrays.toString(arr));

//        String[] str =new String[n];
//        for(int i=0;i<n;i++){
//            str[i]=s.next();
//        }
//     /*   for(int i=0;i<n;i++){
//            System.out.println(str[i]);
//        }*/
//        System.out.println(Arrays.toString(str));
    }
}
