public class sum_of_naturalnum {
    public static int print_sum(int num){
        if(num==1){
            return 1;
        }
        return num+print_sum(num-1);
    }
    public static void main(String args[]){
        int num=100;
        int res=print_sum(num);//this function will return the sum of first 5 natural nums.
        System.out.println(res);
    }
    
}
