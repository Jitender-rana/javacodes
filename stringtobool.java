public class stringtobool {
    public static void main(String[] args) {
        String s1="true";
        String s2="TRu";
        String s3="ok";
        String s4="FALSe";
        boolean b1=Boolean.parseBoolean(s1);
        boolean b2=Boolean.parseBoolean(s2);
        boolean b3=Boolean.parseBoolean(s3);
        boolean b4=Boolean.parseBoolean(s4);
        System.err.println(b1);
        System.err.println(b2);
        System.err.println(b3);
        System.err.println(b4);


    }
    
}
