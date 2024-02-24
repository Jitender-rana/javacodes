public class spiral_amtrix{
    public static void spiral(int matrix[][]) {
        int start_row=0;
        int start_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix[0].length-1;
        while((end_row >= start_row) && (end_col >= start_col)){
            for(int j=start_col;j<=end_col;j++){
                System.out.print(matrix[start_row][j]+" ");
            }
            for(int i=start_row+1;i<=end_row;i++){//start_row+1 as we ahve alraedy printed the first row element while printing the col.
                System.out.print(matrix[i][end_col]+" ");
            }
            for(int j=end_col-1;j>=start_col;j--){
                System.out.print(matrix[end_row][j]+" ");
            }
            for(int i=end_row-1;i>start_row;i--){
                System.out.print(matrix[i][start_col]+" ");
            }
            start_row++;
            end_row--;
            start_col++;
            end_col--;

        }

    }
    /* 
    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];

                }

            }

        }
        return sum;
    }*/
    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }

        }return sum;
    }   
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiral(matrix);
        int diag_sum=diagonal_sum(matrix);
        System.out.println();
        System.out.println("The diagonal sum of matrix is: "+diag_sum);
    }
}
