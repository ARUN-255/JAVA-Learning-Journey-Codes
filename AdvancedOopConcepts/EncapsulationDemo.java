package AdvancedOopConcepts;

class Human{
    private int age;  //Encapsulation
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a ){
        age = a;
    }

    public void setName(String b){
        name = b;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Arun");
        //obj.age = 20;
        //obj.name = "Arun";

        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
