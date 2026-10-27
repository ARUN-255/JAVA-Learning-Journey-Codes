package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

abstract class GameCharacter{
    //abstract parent class
    abstract void attack();
}

public class AbstractInnerClassDemo {
    public static void main(String[] args) {
        
        //calling the abstract class directly
        GameCharacter object = new GameCharacter() {
            void attack(){
                System.out.println("Swinging a heavy iron sword!");
            }
        };

        //creating a complete different behavior with same class
        GameCharacter object1 = new GameCharacter() {
            void attack(){
                System.out.println("Shouting with a gun");
            }
        };

        //printing the statements
        object.attack();
        object1.attack();
    }
}
