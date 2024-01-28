import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r=in.nextInt();
        System.out.println("No. of columns: ");
        int c=in.nextInt();

        //initialization
        int[][] arr=new int[r][c];

        //taking input
        System.out.println("Enter the row elements");
        //the length of 2d array is equal to the number of rows. each row has no. of columns.
        for(int i=0;i<arr.length;i++){

            //for each column in every row
            for(int j=0;j<arr[i].length;j++){   //array's nth element(row) length
                arr[i][j]=in.nextInt();
            }
        }

        //output
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));

//            //for each column in every row
//            for(int j=0;j<arr[i].length;j++){   //array's nth element(row) length
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
        }
    }
}
