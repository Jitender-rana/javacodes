interface JavaAddable{
    int add(int a,int b);
}
public class Lambda_multiple_para {
    public static void main(String[] args){
        JavaAddable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(15,25));
    }
    
}
