package AdvancedOopConcepts;

class Human1{

    int age;
    String name;

    public Human1(){
        age = 20;
        name = "Arun";
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Human1 obj1 = new Human1();
        Human1 obj2 = new Human1();
        System.out.println(obj1.name + " is " + obj1.age + " years old.");
        System.out.println(obj2.name + " is " + obj2.age + " years old.");
    }
}
