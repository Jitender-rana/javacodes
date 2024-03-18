interface Javaable{
    public String say();
}
public class Lambda_with_returnval {

    public static void main(String args[]){
        Javaable s=()->{
            return "java with Lambda";
        };
        System.out.println(s.say());
    }
    
}
