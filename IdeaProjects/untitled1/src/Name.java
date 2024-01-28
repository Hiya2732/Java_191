import java.util.*;
public class Name {
    public static void main(String[] args){
        System.out.print("what is your age? ");
        Scanner sc = new Scanner(System.in);
                boolean b=sc.hasNextInt();
                System.out.println(b);
                if(b==true){
                int age=sc.nextInt();
                    System.out.println("Age "+age);}
    }
}
