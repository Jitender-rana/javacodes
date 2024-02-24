import java.util.*;
public class try6 {
    public static String revstr(String str){
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inputstr=sc.nextLine();
        String res=revstr(inputstr);
        sc.close();
        System.out.print(res);

    }
    
}
