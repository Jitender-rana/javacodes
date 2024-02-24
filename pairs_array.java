public class pairs_array{
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        System.out.println(nums.length);
        for(int i=0;i<(nums.length);i++){
            for(int j=i+1;j<(nums.length);j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }

        }
    }
}
