import java.util.*;
public class arrays{
    public static void insert(int num[],int size){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();


        }
        sc.close();
    }
    public static void print(int num[],int size){
        for(int i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static int largest(int num[],int size){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }
    public static void binarysearch(int num[],int key,int start,int end){
        if(start>end){
            System.out.println("Element not found");
        }else{

        int mid=(start+end)/2;
        if(num[mid]==key){
            System.out.print("element found: "+key);
            
        }
        if(num[mid]>key){
            end=mid-1;
            binarysearch(num,key,start,end);
        }else{
            start=mid+1;
            binarysearch(num,key,start,end);
        }
    }
    }
    /*public static int binarysearch(int num[],int key,int size){
        int start=0;
        int end=size-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(num[mid]==key){
                return mid+1;//this returns position.

            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }*/

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num[]= new int[10];

        
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        insert(num,size);
        print(num,size);
        sc.close();
        int larg=largest(num,size);
        System.out.println();
        System.out.println("The largest number of array is :"+larg);
        int start=0;
        int end=size-1;
        binarysearch(num,60,start,end);
        
    }
}