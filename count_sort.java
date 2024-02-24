public class count_sort{
    public static void main(String args[]){
        int nums[]={1,4,1,3,2,4,3,7,9,4};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=(largest<nums[i])?nums[i]:largest;


        }
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;

        }
        int j=0;

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j]=i;//index ko utha ke rkhte hain 
                count[i]--;
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}