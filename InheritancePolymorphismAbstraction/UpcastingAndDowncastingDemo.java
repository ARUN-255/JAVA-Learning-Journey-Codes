package InheritancePolymorphismAbstraction;

class AB{
    public void show1(){
        System.out.println("In show AB");
    }
}

class BC extends AB{
    public void show2(){
        System.out.println("In show BC");
    }
}

public class UpcastingAndDowncastingDemo {
    public static void main(String[] args) {
        //Upcasting
        AB obj = (AB) new BC();
        obj.show1();

        //Downcasting
        BC obj1 = (BC) obj;
        obj1.show2();
    }
}
