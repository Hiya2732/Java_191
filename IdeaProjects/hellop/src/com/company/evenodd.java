package com.company;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.print("Enter the number u wish to check: ");
        float a=n.nextFloat();
        if(a%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd");
        }

    }
}
