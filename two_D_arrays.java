import java.util.*;
public class two_D_arrays {
    public static void create(int matrix [][]) {
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc1.nextInt();
            }
        }
        sc1.close();
    }
    public static void print(int matrix[][]) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static void insert(int matrix[][],int r,int c,int key){
        /*for(int i=r+1;i<=matrix.length;i++){
            for(int j=c+1;j<=matrix[0].length;j++){
                matrix[i+1]=matrix[i];
            }
        }*/
        matrix[r][c]=key;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");

        int rows=sc.nextInt();
        System.out.println("Enter the no of colums: ");
        int columns=sc.nextInt();
        int matrix[][]=new int[rows][columns];
        create(matrix);
        print(matrix);
        
        System.out.println("Enter the element you want to insert");
        Scanner sc2=new Scanner(System.in);
        int key=sc2.nextInt();
        System.out.println("Enter the row and column at which u want to enter the element");
        int r=sc.nextInt();
        int c=sc.nextInt();
        insert(matrix,r,c,key);
        print(matrix);
        sc.close();
        sc2.close();


    }
    
}
