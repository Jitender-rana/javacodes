public class Letter_to_UpperCase{
    public static String to_upper_case(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if((str.charAt(i) ==' ') && (i<str.length()-1)){
                //i< condition so that our last position is space than we can counter that,there should be words after that space.
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));


            }else{
                sb.append(str.charAt(i));
            }
            //return sb.toString();

        }return sb.toString();
    }
    public static void main(String args[]){
        String str="hi, iam jitender rana , nice to meet you";
        String result=to_upper_case(str);
        System.out.println(result);
    }
}
