import java.util.*;
public class arraylistarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al= new ArrayList<>();
        Scanner in=new Scanner(System.in);

        //initialization
        for(int i=0;i<3;i++){
        al.add(new ArrayList<>());} //for adding 3 arraylist into arraylist

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                al.get(i).add(in.nextInt()); //get the ith list and add its elements (ith list initialized in line 8)
            }
        }
        System.out.println(al);

    }
}
