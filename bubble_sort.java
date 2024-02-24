public class bubble_sort{
    public static void main(String args[]){
        int nums[]={2,3,1,5,8,6};
        for(int turn=0;turn<nums.length-1;turn++){
            for(int j=0;j<nums.length-1-turn;j++){
                int temp;
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }


        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}