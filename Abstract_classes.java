public class Abstract_classes {
    public static void main(String args[]){
        Horse hr=new Horse();
        hr.walk();
        Chicken chick=new Chicken();
        chick.walk();

    }
    
}
abstract class Animal{
    Animal(){
        System.out.println("Base class Animal constructor is called..");
    }
    void eat(){
        System.out.println(" Animal is eating..");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("child class Horse's constructor is called..");
    }
    void walk(){
        System.out.println("walk on 4 legs...");
    }

}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Child class chicken's constructor is called..");
    }
    void walk(){
        System.out.println("Walks on two legs");
    }
}
