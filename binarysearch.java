public class binarysearch {
    public static boolean binary_search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return true;

            }
            else if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,8,9};
        boolean found=binary_search(arr,2);
        System.out.print(found);

    }
    
}
