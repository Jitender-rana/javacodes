import java.util.LinkedList;

public class linkedlist {
    public static void main(String args[]){
        LinkedList<String> languages=new LinkedList<>();
        languages.add("Java");
        languages.add("python");
        languages.add("Javascript");
        languages.add("Kotlin");
        System.out.println("Linked List: "+languages);
        String str=languages.remove(1);
        System.out.println("Removed element: "+str);
        System.out.println("Updates LinkedList: "+languages);
    }
    
}
