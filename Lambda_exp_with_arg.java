interface Javaable{
    public String say(String name);
}
public class Lambda_exp_with_arg {
    public static void main(String args[]){
        //Lambda expression with single parameter.
        Javaable s1=(name)->{
            return "My name is "+name;
        };
        System.out.println(s1.say("Jitender Rana"));
    }
    
}
