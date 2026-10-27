package InheritancePolymorphismAbstraction;

class Computer123{
    String brand = "Dell";
    //inner class - non static
    class Processor{
        public void displayDetails(){
            System.out.println("Processor belongs to the computer brand " + brand);
            System.out.println("Processor status : Running smoothly at 3.5GHz.");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Computer123 object = new Computer123();
        Computer123.Processor object1 = object.new Processor();
        object1.displayDetails();
    }
}
