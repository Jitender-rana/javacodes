public class upertolower {
    public static void main(String args[]){
        String h1="hello";
        String res="";
        for(int i=0;i<h1.length();i++){
            if(i==0 || (i%2==0)){
                res+=Character.toUpperCase(h1.charAt(i));
               
            }else{
                res+=h1.charAt(i);
            }
        }
        System.out.println(res);
    }
    
}
