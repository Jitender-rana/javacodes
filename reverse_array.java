public class reverse_array {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int size=arr.length;

        int i=0;
        while(i<size/2){
            int temp;
            temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
            i++;


        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");

        }
    }
    
}