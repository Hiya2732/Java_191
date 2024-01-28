import java.util.ArrayList;

public class stringLinearS {
    public static void main(String[] args) {
        String s="Nikhil";
        char target='l';
        System.out.println(find(s,target));

    }

    static ArrayList find(String s,char target){
        if(s.length()==0){
            return new ArrayList<>();
        }

        int num=0;
        ArrayList<Integer> lis=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(target==s.charAt(i)){
                num++;
              lis.add(i);
              //System.out.println(lis);
            }
        }
//        for(char c: s.toCharArray()){
//            if(c==target){
//                return true;
//            }
//        }
        return lis;
    }
}
