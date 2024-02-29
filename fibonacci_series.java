import java.util.*;
public class fibonacci_series {
    public static int valueof_fibonacci(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return valueof_fibonacci(num-1)+valueof_fibonacci(num-2);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the index of fibonacci which u want to find");
        int num=sc.nextInt();
        int res=valueof_fibonacci(num);
        System.out.println("The "+num+"the fibonacci number is: "+res);
        sc.close();
    }
    
}
