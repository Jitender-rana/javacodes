interface showable{
    void show();
    interface Message{
        void msg();
    }
}
public class TestNestedInterface1 implements showable.Message{
    public void msg(){System.out.println("Hello nested interface");}
    public static void main(String args[]){
        showable.Message message=new TestNestedInterface1();
        message.msg();
    }

} 
    

