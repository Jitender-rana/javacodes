public class Max_elements {
    public static void print(int arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"");
        }
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int left_max[]=new int[arr.length];
        left_max[0]=arr[0];
        for(int i=1;i<left_max.length;i++){
            left_max[i]=Math.max(arr[i], left_max[i-1]);
        }
        int right_max[]=new int[arr.length];
        int n=arr.length;
        right_max[n-1]=arr[n-1];
        for(int k=n-2;k>=0;k--){
            right_max[k]=Math.max(arr[k], right_max[k+1]);
        }
        print(right_max);
        System.out.println();
        print(left_max);


    }
    
}
