import java.io.IOException;
import java.util.*;

public class exception_handling {
    public static void main(String args[]){
        int marks[]=new int[3];
        marks[0]=22;
        marks[1]=88;
        marks[2]=44;
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the index u want to select");
        // int index=sc.nextInt();
        // System.out.println("enter the number with which u want to divide");
        // int number=sc.nextInt();
        try{
            System.out.println("enter the index u want to select");
            int index=sc.nextInt();
            System.out.println("enter the number with which u want to divide");
            int number=sc.nextInt();
            System.out.println("The element which we want to access is : "+marks[index]);
            System.out.println("The result of divison: "+marks[index]/number);
        }catch(InputMismatchException e){
            System.out.print(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e);
        }catch(ArithmeticException e){
            System.out.print(e);

        }catch(Exception e){
            System.out.print(e);
        }


    }
    
}
