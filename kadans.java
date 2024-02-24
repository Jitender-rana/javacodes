public class kadans{
    public static void main(String args[]){
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int i=0;i<nums.length;i++){
            if((cur_sum+nums[i])<=0){
                cur_sum=0;
            }
            else{
                cur_sum+=nums[i];

            }
            max_sum=(cur_sum>max_sum)?cur_sum:max_sum;

        }
        System.out.print("The max sum of sub array using kadans algorithm is:  "+max_sum);
    }
}
