import java.util.*;
public class fibonacci_arraay {
    public static int[] fibo_arr(int n){
        int res[]=new int[n];
        int num1=0;
        int num2=1;
        int i=0;
        if(n>=1){
            res[i]=num1;
            i++;
            n--;
        }
        if(n>=2){
            res[i]=num2;
            i++;
            n--;
        }
        while(n>0){
            int num3=num1+num2;
            res[i]=num3;
            int temp=num2;
            num2=num3;
            num1=temp;
            i++;
            n--;
        }
        return res;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=fibo_arr(num);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
