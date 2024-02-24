public class String_compression{
    public static String compression(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count=count+1;
                i++;

            }
            sb.append(str.charAt(i));
            
            if(count>1){
                sb.append(count);
            }


        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="abbbbccc";
        String res=compression(str);
        System.out.println(res);
    }
}
