public class Trapping_rainwater{
    public static void right_max(int right_max_bound[],int bars[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bars.length;i++){
            max=0;
            for(int j=i;j<bars.length;j++){
                max=max<bars[j]?bars[j]:max;
            }
            right_max_bound[i]=max;


        }

    }
    public static void left_max(int left_max_bound[],int bars[]){
        int max=Integer.MIN_VALUE;
        for(int i=bars.length-1;i>=0;i--){
            max=0;
            for(int j=i;j>=0;j--){
                max=max<bars[j]?bars[j]:max;
            }
            left_max_bound[i]=max;

        }


    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int bars[]={4,2,0,6,3,2,5};
        int right_max_bound[]=new int[bars.length];//it is auxillary array.
        int left_max_bound[]=new int[bars.length];
        right_max(right_max_bound, bars);
        left_max(left_max_bound,bars);
        //print(right_max_bound);
        //print(left_max_bound);
        int water_lvl[]=new int[bars.length];
        for(int i=0;i<water_lvl.length;i++){
            water_lvl[i]=Math.min(right_max_bound[i],left_max_bound[i]);

        }
        int area=0;
        int width=1;
        for(int i=0;i<bars.length;i++){
            area+=(water_lvl[i]-bars[i])*width;
        }
        System.out.print(area);

    }
}