import java.util.Arrays;
import java.util.Collections;
//import java.util.*;
public class inbuilt_sort{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String args[]){
        int nums[]={4,5,1,3,2};
        Arrays.sort(nums);
        Integer num[]={4,5,1,3,2};
        Arrays.sort(num,Collections.reverseOrder());
        print(nums);
        


    }
}
