/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class student extends Thread
{
    int amount=1000;

    void withdraw(int amount)
    {
        synchronized(this)
        {
            System.out.println("Withdrawing...");

            if( this.amount<amount)
            {
                System.out.println("Low balance....");

                try
                {
                    wait();
                }catch(Exception e){}
            }//if ends
            this.amount=this.amount-amount;
            System.out.println(this.amount);
            System.out.println("withdraw completed");
        }
    }
    synchronized void deposit(int amount)
    {
        System.out.println("going to deposit...");
        this.amount=this.amount+amount;
        System.out.println("deposit completed... ");
        System.out.println(this.amount);
        notify();
    }
}  // student ends
class interth{
    public static void main(String args[]){
        student  s=new student();
        new Thread(){
            public void run(){s.withdraw(800);}
        }.start();
        new Thread(){
            public void run(){s.deposit(1000);}
        }.start();

    }}




