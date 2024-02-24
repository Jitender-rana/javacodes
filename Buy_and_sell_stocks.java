public class Buy_and_sell_stocks{
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int bp=prices[0];//buying price.
        int sp;//selling price.
        int profit;
        int max_profit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            //bp=prices[i]<bp?prices[i]:bp;
            sp=prices[i];
            
            if((sp-bp)<0){
                profit=0;

            }
            profit=sp-bp;
            bp=prices[i]<bp?prices[i]:bp;
            max_profit=profit>max_profit?profit:max_profit;
        }
        //max_profit=profit>max_profit?profit:max_profit;here it will not have that value of sp-bp becuase thats scope is limited inside for loop
        System.out.println("the maximum profit is: "+max_profit);

    }
}
