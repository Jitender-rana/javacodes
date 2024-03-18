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
         Drawable d=new Drawable(){
            public void draw(){
                System.out.println("Java Version is: "+width);
             }

         };
        d.draw();
    }
    
}
