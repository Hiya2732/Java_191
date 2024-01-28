package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class squrt {
    static boolean sqrt1(float a)
    {
        float b = (float) Math.sqrt(a);
        return (Math.pow(b, 2)) == a;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number:");
        float a;
        a=n.nextFloat();
        if (sqrt1(a))
        {
            int b = (int) Math.sqrt(a);
            System.out.println("The sqrt of is: " +b);
            System.out.println("It is a perfect square");
        }
        else
        {
            float c = (float) Math.sqrt(a);
            System.out.println("The sqrt is: " +c);
            System.out.println("Not a perf square");
        }
    }
}
