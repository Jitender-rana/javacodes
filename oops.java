import java.util.*;
public class oops{
    public static void main(String args[]){
        System.out.println("Enter the username you want to set the for your Bank Account");
        Scanner sc2=new Scanner(System.in);
        String user=sc2.nextLine();
        Bank_account ba=new Bank_account();
        ba.username=user;
        //ba.set_pw();----not possible directly so i created a class to authenticate.
        ba.authenticate();
        //ba.display_password();-----again not possible as it is also private.
        ba.show_password();
        sc2.close();


    }
}
class Bank_account{
    public String username;
    private int password;
    public int dig_lock=123;
    private void set_pw(int s){
        this.password=s;
    }




    public void authenticate(){
        int lock;
        int count=3;
        Scanner sc1=new Scanner(System.in);

        while(count>0){
            System.out.println("Enter the lock if want to set the password "+username);
            lock=sc1.nextInt();
            sc1.nextLine();
            boolean allow=(dig_lock==lock)?true:false;
            if(allow){
                System.out.println("Enter the paassword you want to set "+username);
                int s1=sc1.nextInt();
                set_pw(s1);
                break;
            }
            count--;
            System.out.println("Sorry try again to aunthenticate "+username);
        }
        if(count<=0){
            System.out.println("Failed to authenticate ,sorry you cant set the password "+username);
        }
        sc1.close();
    }




    public void show_password(){
        int count=3;
        int lock;
        Scanner sc=new Scanner(System.in);
       
        
        while(count>0){
            System.out.println("Enter the lock if u want to access the password "+username);
            lock=sc.nextInt();
            sc.nextLine();
            boolean allow=(dig_lock==lock)?true:false;
            if(allow){
                display_password();
                break;
            }
            count--;
            System.out.print("Sorry wrong passwrod Try again "+username);

        }
        if(count<=0){
            System.out.print("You have used ur all terns,sorry can't show password "+username);
        }
        sc.close();
    }
    private void display_password(){
        System.out.print(password);

    }


}