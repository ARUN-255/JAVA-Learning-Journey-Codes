package InheritancePolymorphismAbstraction;

//Runtime polymorphism
class Animal{
    public void makeSound(){
        System.out.println("Making a generic sound!");
    }
}

class Dog extends Animal{
    @Override 
    public void makeSound(){
        System.out.println("Dogs make sound like : woff woff!");
    }
}

class Cat extends Animal{
    @Override 
    public void makeSound(){
        System.out.println("Cats make sound like : Meow!");
    }
}

//Compile time polymorphism method overloading

class MathOperation{

    public int add(int num1 , int num2){
        return num1 + num2 ;
    }

    public int add(int num1 , int num2 , int num3){
        return num1 + num2 + num3 ;
    }
}



public class PolymorphismDemo {
    public static void main(String[] args) {

        //printing compile time polymorphism
        MathOperation object1 = new MathOperation();
        System.out.println("Addition of two number : " + object1.add(178,278));
        System.out.println("Addition of three number : " + object1.add(178,278,987));

        //printing runtime polymorphism override
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();
    }

}
