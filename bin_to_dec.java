public class bin_to_dec{
    public static void main(String args[]){
        int bin=111;
        int dec=0;
        int ld;
        int i=0;
        while(bin!=0){
            ld=bin%10;
            dec= dec + (int)Math.pow(2,i)*ld;
            bin/=10;
            i++;


        }
        System.out.print("The decimal value is :"+dec);
    }
}
