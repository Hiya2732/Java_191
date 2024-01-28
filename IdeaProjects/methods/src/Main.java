import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your name");
        String n=sc.next();
        String gotname=greet(n);
        System.out.println(gotname);
        }

        static String greet(String n){
        String name="Hello " +n;
            return name;
        }
    }
