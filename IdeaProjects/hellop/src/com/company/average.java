package com.company;
import java.util.*;
public class average
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=s.nextInt();
        int a[]=new int[n]; //declaring array
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter marks of student" +(i+1));
            a[i]=s.nextInt(); //array input
        }
        //avg
        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        float avg=sum/n;
        System.out.println("The subject avg is " +avg);
    }

}
