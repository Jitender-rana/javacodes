public class staircase{
    public static boolean search(int matrix[][],int key){//using top right as piviot.
        int i=0;
        int j=matrix[0].length-1;

        while(i<matrix.length && j>=0){
            if(matrix[i][j]==key){
                System.out.println("element found at "+(i+1)+"th row and "+(j+1)+"th cloumn.");
                return true;
            }else if(matrix[i][j]>key){
                j--;
            }
            else{
                i++;
            }

        }
        System.out.println("element not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=40;
        search(matrix,key);
    }
}
