package InheritancePolymorphismAbstraction;

//Parent class
class Vehicle{

    //parent class method
    public void startEngine(){

        System.out.println("The car engine has been started and the soud is generic . ");
    }
}

//Child class
class Car extends Vehicle{

    //child method
    @Override 
    public void startEngine(){

        System.out.println("Now the engine gets a life and roaring like anything - Vroom Vroom !!");
    }

}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        
        Vehicle object = new Vehicle();
        object.startEngine();

        Car object1 = new Car();
        object1.startEngine();
    }
}
