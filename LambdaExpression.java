public class LambdaExpression {
    /**
     * InnerLambdaExpression
     */
    interface Drawable {
        public void draw();

    
        
    }
    public static void main(String args[]){
        int width=8;
        //without lambda ,Drawable implementation using anonymous class---(arg list)->{body}
        //  Drawable d=new Drawable(){
        //     public void draw(){
        //         System.out.println("Java Version is: "+width);
        //      }

        //  };
        //or Another way to do same thing is by using lambda expression with no arguments.
        Drawable d=()->{
            System.out.println("Java Version is: "+width);

        };
        d.draw();
    }
    
}
