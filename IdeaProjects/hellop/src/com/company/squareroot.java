package com.company;
import static java.lang.Math.sqrt;
import java.util.*;

     public class squareroot {
         public static void main(String[] args)
         {
             float a;
             Scanner s= new Scanner(System.in);
             System.out.println("Enter a number");
             a=s.nextFloat();

             if((sqrt(a)*sqrt(a))==a)
             {
                 System.out.println("It is a perfect square");
             }
             else
             {
                 System.out.println("Its not a perfect square");
             }

         }


     }

