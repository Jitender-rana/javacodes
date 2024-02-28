public class prefix_array{
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int prefix[]=new int[arr.length];
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr_sum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
            
        }
        System.out.println("The maximum sub array sum is: "+max_sum);
    }
}
