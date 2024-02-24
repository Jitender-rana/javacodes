public class max_subarraya_sum {
    public static void main(String args[]) {
        int num[] = {2,4,6,8,10};
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end=j;
                int current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum += num[k];
                }

                if (sum < current_sum) {
                    sum = current_sum;
                }
            }
        }

        System.out.print("The sum of the array with the highest sum is: " + sum);//the problem with this code is O(n^3) which is very bad.
    }
}
