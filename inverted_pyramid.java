import java.util.*;
public class inverted_pyramid{
    public static void print_inverted_pyramid(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the no of colums: ");
        int col=sc.nextInt();
        print_inverted_pyramid(row,col);
        sc.close();

    }
}
