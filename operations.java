public class operations{
    public static void get_ith_bit(int num,int bit){
        if(((num>>bit)&1)>=1){
            System.out.println("The "+bit+"th bit is 1.");
        }else{
            System.out.println("The "+bit+"th bit is 0.");
        }
    }
    public static int set_ith_bit(int num,int bit){
        int num2=((num)|1<<bit);
        return num2;
    }
    public static int clear_ith_bit(int num,int bit){
        int num2=((num)&~(1<<bit));
        return num2;
    }
    public static void main(String args[]){
        int num=15;
        int bit=2;
        get_ith_bit(num,bit);
        //set_ith_bit
        //int num2=((3)|1<<bit);
        

    }
}
