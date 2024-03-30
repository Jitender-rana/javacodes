public class method_overloading {
    public static void main(String args[]){
        B b=new B();
        b.set_num();
        System.out.println(b.num);
    }
    
}
class A{
    int num;
    void set_num(){
        num=5;
    }

}
class B extends  A{
    void set_num(){
        super.num=10;
    }

}