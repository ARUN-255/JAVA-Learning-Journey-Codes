package InheritancePolymorphismAbstraction;

class A{
    
    public A(){
        System.out.println("This is the constructor of class A (Parent class)");
    }
}

class B extends A{
    
    public B(){
        System.out.println("This is the constructor of class B with out parameter (Child class)");
    }

    public B(int x){
        this();
        System.out.println("This is the constructor 2 of the child class with parameter of value" + x);
    }
}

public class ThisAndSuperConstructorCallsDemo {
    public static void main(String[] args) {
        B object = new B(10);
        System.out.println(object);

    }
}
