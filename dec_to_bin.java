public class dec_to_bin{
    public static void main(String args[]){
        int dec=16;
        int bin=0;
        while(dec!=0){
            bin=(bin*10)+dec%2;
            dec/=2;
        }
        System.out.print("the binary form is: "+bin);
    }
}