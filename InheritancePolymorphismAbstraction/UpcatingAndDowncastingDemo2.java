package InheritancePolymorphismAbstraction;

class Phone{

    void call(){
        System.out.println("Making a standard call");
    }
}

class SmartPhone extends Phone{
    void call(){
        System.out.println("Making a high defination video call !");
    }

    void takingPicture(){
        System.out.println("Click!, Captures a 4k picture");
    }
}

public class UpcatingAndDowncastingDemo2 {
    public static void main(String[] args) {
        
        //Calling the parent class normally 
        Phone object = new Phone();
        object.call();

        //Upcating
        Phone object1 = new SmartPhone();
        object1.call();
        
        //Downcasting
        SmartPhone object2 = (SmartPhone) object1;
        object2.takingPicture();
        object2.call();
    }
}
