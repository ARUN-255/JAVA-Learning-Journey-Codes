package InheritancePolymorphismAbstraction;


//abstract class
abstract class DemoTravel{

    //abstract method with no body 
    abstract void startEngine1();

    //normal method
    void honk(){
        System.out.println("pom! pom!");
    }
}

class Cars1 extends DemoTravel{
    @Override 
    //implementing the body of the abstract method in this child class
    void startEngine1(){
        System.out.println("The engine have been started by the key");
    }
}

public class AbstractKeywordDemo {
    public static void main(String[] args) {
        
        //upcasting because we can't directly initiate a object
        DemoTravel object = new Cars1();
        object.startEngine1();
    }
}
