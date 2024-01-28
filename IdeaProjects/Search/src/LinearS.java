public class LinearS {
    public static void main(String[] args) {

        int[] num={1,23,65,73,23,-11,9,-9};
        int target=-111;
        int ans=linear(num,target);
        System.out.println(ans);
    }

    static int linear(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1; // target does not exist
    }


}
