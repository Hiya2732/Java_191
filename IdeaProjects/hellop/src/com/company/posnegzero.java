package com.company;

import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.print("Enter the number u wish to check: ");
        float a=n.nextFloat();
        if(a>0)
        {
            System.out.println("The no. is positive");
        }
        else if(a<0)
        {
            System.out.println("The entered no. is neg");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}
