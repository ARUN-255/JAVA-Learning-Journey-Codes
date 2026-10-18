package AdvancedOopConcepts;

class Human2{

    int age ;
    String name;

    public Human2(){                        //Normal or default constructor
        age = 15;
        name = "Dhanya";
    }

    public Human2(int a , String n){       //Parameter constructor
        age = a;
        name = n;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        
        Human2 object = new Human2();
        Human2 object1 = new Human2(20 , "Arun");
        
        System.out.println(object.name + " is " + object.age + " years old ");
        System.out.println(object1.name + " is " + object1.age + " years old ");
        
    }
}
