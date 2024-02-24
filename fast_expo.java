public class fast_expo{
    public static int fast_exponent(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;



            }
            a=a*a;
            n=n>>1;

        }
        return ans;
    }
    public static void main(String args[]){
        int a=5;
        int b=3;
        int res=fast_exponent(a,b);
        System.out.println(res);
    }
}
