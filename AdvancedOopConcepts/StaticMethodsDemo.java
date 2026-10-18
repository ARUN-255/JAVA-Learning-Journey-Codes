package AdvancedOopConcepts;

class Mobile2{

    String brand ;
    int price ;
    static String name ;

    public void show(){

        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile2 obj ){

        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile2.name);
    }

}


public class StaticMethodsDemo {
    public static void main(String[] args) {
        Mobile2 obj1 = new Mobile2();
        obj1.brand = "SamSung";
        obj1.price = 150000;
        Mobile2.name = "Smartphone";

        Mobile2 obj2 = new Mobile2();
        obj2.brand = "Apple";
        obj2.price = 149999;
        Mobile2.name = "Smartphone";                                   

        obj1.show();                                                  
        obj2.show();

        Mobile2.show1(obj1);
    }
}
