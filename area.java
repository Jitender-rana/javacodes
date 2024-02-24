import java.util.*;
public class area{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int height=sc.nextInt();
        float area=(float)0.5*length*height;
        System.out.println(area);
        sc.close();

    }
}