import java.util.*;
public class array_sort_rec {
    public static boolean Sorted_arr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sorted_arr(arr, i+1);
    }
    public static void main(String args[]){
        System.out.print("Enter the number of the elements in tha array");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print(Sorted_arr(arr,0));
        sc.close();
    }
    
}
