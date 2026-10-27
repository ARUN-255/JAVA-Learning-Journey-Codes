package InheritancePolymorphismAbstraction;

class Laptop123{
    void start(){
        System.out.println("The laptop is starting up normally.......");
    }
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
     
        //Regular object creation
        Laptop123 object = new Laptop123();
        object.start();

        //Anonymous inner class
        Laptop123 object1 = new Laptop123(){
            @Override 
            void start(){
                System.out.println("This is a gaming laptop");
            }
        };
        object1.start();
    }
}
