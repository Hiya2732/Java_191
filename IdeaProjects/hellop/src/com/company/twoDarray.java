package com.company;
import java.util.*;
public class twoDarray {
    public static void main(String a[])
    {
        int row,col;
        int arr[][]=new int[10][10];
        System.out.println("Enter the row and column of a matrix");
        Scanner s =new Scanner(System.in);
        row = s.nextInt();
        col =s.nextInt();
        System.out.println("enter the values of the matrix");

        for(int i = 0;i< row; i++)
        {
            for (int j = 0; j<col ; j++)
            {
                arr[i][j]=s.nextInt();

            }

        }
        System.out.println("the values are");

        for(int i = 0;i< row; i++)
        {
            for (int j = 0; j<col ; j++)
            {
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }


    }



}