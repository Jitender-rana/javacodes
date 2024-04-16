class Test<T>{
    T obj;
    Test(T obj){this.obj=obj;}
    public T getObject(){return this.obj;}
}
public class generics {
    public static void main(String[] args){
    Test<Integer> iobj = new Test<Integer>(25);
    System.out.println(iobj.getObject());
    Test<String> sobj=new Test<String>("Jitender rana");
    System.out.println(sobj.getObject());}
    
}
