public class try15 {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int bp=prices[0];
        int sp;
        int profit;
        int max_profit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            sp=prices[i];
            if((sp-bp)<0){
                profit=0;
            }
            profit=sp-bp;
            bp=(bp>prices[i])?prices[i]:bp;
            max_profit=(profit>max_profit)?profit:max_profit;


        }
        System.out.println(max_profit);
    }
    
}
