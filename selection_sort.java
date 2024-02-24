public class selection_sort {
    public static void main(String args[]){
        int nums[]={5,4,1,3,2};
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int min_pos=i;
            for(int j=i+1;j<n;j++){
                if(nums[min_pos]>nums[j]){
                    min_pos=j;
                }
            }
            int temp=nums[min_pos];
            nums[min_pos]=nums[i];
            nums[i]=temp;

        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
