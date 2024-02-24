
import java.util.*;
public class Try1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        //int nums[]={0,1,2,5,7,3,5};
        for(int i=0;i<n;i++ ){
            nums[i]=sc.nextInt();
        }
        int key=5;
        int pos=3;
        n++;
        //int nums[]=new int[n];
        for(int i=pos-1;i<n;i++){
            nums[i+1]=nums[i];
        }
        nums[pos-1]=key;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();


    }
}