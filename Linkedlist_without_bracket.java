import java.util.LinkedList;

public class Linkedlist_without_bracket {
    public  static void main(String args[]){
        LinkedList<String> animals=new LinkedList<>();
        animals.add("Cow");
        animals.add("cat");
        animals.add("Dog");
        System.out.println("Linked list: "+animals);
        System.out.println("Accessing linked list elemnts:");
        for(String animal: animals){
            System.out.print(animal);
            System.out.print(", ");
        }
    }
    
}
