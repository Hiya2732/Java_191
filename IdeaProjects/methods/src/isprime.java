import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. ");
        int n=sc.nextInt();
        boolean ans=isprime(n);
        if(ans==false){
            System.out.println("not prime");}
            else
                System.out.println("prime");
    }
    static boolean isprime(int na){
        int c=2;
        while(c*c<=na){
            if(na%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
