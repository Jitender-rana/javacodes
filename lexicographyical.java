public class lexicographyical{
    public static void main(String args[]){
        String str[]={"apple","mango","banana","pineaaple"};
        String largest=str[0];
        for(int i=0;i<str.length;i++){
            if(str[i].compareTo(largest)>0){
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
}