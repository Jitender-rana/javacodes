public class try12 {
    public static int bin_to_dec(int bin){
        int ld=0;
        int dec=0;
        int i=0;
        while(bin!=0){
            ld=bin%10;
            dec=(int)(dec+(Math.pow(2,i)*ld));
            i++;
            bin/=10;
        }
        return dec;
    }
    public static int dec_to_bin(int dec){
        int rem=0;
        int bin=0;
        int i=0;
        while(dec!=0){
            rem=dec%2;
            bin=(int)(bin+(rem*Math.pow(10,i)));
            i++;
            dec/=2;

        }
        return bin;
    }
    public static void main(String args[]){
        int bin=111;
        int num=bin_to_dec(bin);
        System.out.println("The decimal value of number is:"+num);
        int bin1=dec_to_bin(7);
        System.out.println("The binary value of number is:"+bin1);
    }
    
}
