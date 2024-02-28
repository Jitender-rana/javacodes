public class recurssion1 {
    public static void print_inc(int num){
        if(num==0){
            return;
            
        }
        //System.out.print(num+" ");
        print_inc(num-1);
        System.out.print(num+" ");
    }
    public static void print_dec(int num){
        if(num==0){
            return;
            
        }
        
        System.out.print(num+" ");
        print_dec(num-1);
        ///System.out.print(num+" ");
    }
    
    public static void main(String args[]){
        int num=10;
        print_inc(num);
        print_dec(num);

    }
}
