package InheritancePolymorphismAbstraction;

class Parent{
    String name = " Parent class";
}

class Child extends Parent{
    String name = "Child class";

    public void show(String name){

        //print thr local parameter value
        System.out.println("Parameter name : " + name);

        //this forces the java to look at current class
        System.out.println("Current class : "+ this.name);

        //super forces the java to look parent of this class
        System.out.println("Parent class : " + super.name);
    }
}

public class ThisAndSuperKeywordDemo {
    public static void main(String[] args) {
        Child object = new Child();
        object.show("local variable");

    }
    
}
