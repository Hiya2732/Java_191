package com.company;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item;
        float total;
        System.out.println("Enter number of items");
        item = sc.nextInt();
        Mall m = new redeem();
        total = m.clothing(item);

        tax t = new tax();

        t.calc_tax(total);
        t.show_tax();
    }
}
abstract class Mall {
    Scanner s=new Scanner(System.in);
    abstract float clothing(int item);
}

class redeem extends Mall {
    float[] price=new float[100];
    float total_amt;
    float redeem_amt;
    String[] iname=new String[100];

    float clothing(int item){

        for(int i=0;i<item;i++){
            System.out.println("Product"+(i+1)+" Details");
            iname[i]=s.next();
            System.out.println("Product"+(i+1)+" Price");
            price[i]=s.nextInt();
            total_amt+=price[i];
        }
        System.out.println("Enter the amount to be redeemed");
        redeem_amt=s.nextFloat();
        total_amt=total_amt-redeem_amt;
        System.out.println("*******");
        System.out.println("Item Name              Price");
        for(int i=0;i<item;i++){
            System.out.println(iname[i]+"                  "+price[i]);
        }
        System.out.println("Total amount redeemed "+redeem_amt);
        return total_amt;
    }
}
class tax extends redeem{
    float CGST,SGST,total_tax,final_amt;
    void calc_tax(float total_amt)
    {

        CGST=0.0525f*total_amt;
        SGST=0.0525f*total_amt;
        total_tax = CGST+SGST;
        final_amt = total_amt+total_tax;

    }
    void show_tax(){

        System.out.println("Central GST : "+CGST);
        System.out.println("State GST   :"+SGST);
        System.out.println("Total Amount to be paid  : "+final_amt);
    }}

