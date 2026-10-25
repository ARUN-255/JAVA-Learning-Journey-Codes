package InheritancePolymorphismAbstraction;

class AnimalDemo{
    void makeNoice(){
        System.out.println("Makes a generic noice");
    }
}

class DogDemo extends AnimalDemo{
    @Override 
    void makeNoice(){
        System.out.println("Bark! Bark!");
    }
    void fetch(){
        System.out.println("The dog is barking");
    }
}

public class UpcastingAndDowncastingDemo1 {
    public static void main(String[] args) {
        
        //Normal calling of an object in the main class
        AnimalDemo object = new AnimalDemo();
        object.makeNoice();

        //Upcasting
        AnimalDemo object1 = new DogDemo();
        object1.makeNoice();
        
        //downcasting
        DogDemo object2 = (DogDemo)  object1;
        object2.fetch();
    }
}
