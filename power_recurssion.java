public class power_recurssion {
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfsqpow=pow(a,n/2);
        int halfsq=halfsqpow*halfsqpow;
        if(n%2!=0){
            halfsq=a*halfsq;
        }
        return halfsq;
    }
    public static void main(String args[]){
        int a=2;
        int n=6;
        int result=pow(a,n);
        System.out.println(result);
    }
    
}
