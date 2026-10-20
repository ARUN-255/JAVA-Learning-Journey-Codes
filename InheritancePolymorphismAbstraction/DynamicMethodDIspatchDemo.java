package InheritancePolymorphismAbstraction;

class Computer{

    public void bootup(){
        System.out.println("THe computer is booting up");
    }
}

class Laptop extends Computer{
    @Override 
    public void bootup(){
        System.out.println("The light turns on nand laptop displays");
    }
}

class Desktop extends Computer{
    @Override 
    public void bootup(){
        System.out.println("The fans spin and then the computer turns on");
    }
}

public class DynamicMethodDIspatchDemo {
    public static void main(String[] args) {

        Computer object;
        object = new Laptop();
        object.bootup();

        object = new Desktop();
        object.bootup();
    }
}
