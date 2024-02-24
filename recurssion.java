public class recurssion{
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        int f=num*factorial(num-1);
        return f;
    }
    public static void main(String args[]){
        int n=2;
        int fact=factorial(n);
        System.out.print(fact);
    }
}
