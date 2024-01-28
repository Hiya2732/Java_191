import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> lis=new ArrayList<>();
        Scanner in=new Scanner(System.in);


        for(int i=0;i<6;i++){
            lis.add(in.nextInt());
        }

        for(int i=0;i<6;i++){
            System.out.println(lis.get(i));
        }
//        lis.add(90);
//        lis.add(28);
//        lis.set(0,99);
//        System.out.println(lis);
//        lis.remove(0);
//        System.out.println(lis);
//        System.out.println(lis.contains(28));

    }
}
