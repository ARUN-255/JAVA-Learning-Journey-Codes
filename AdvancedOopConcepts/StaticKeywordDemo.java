package AdvancedOopConcepts;

class Mobile{
    String brand;        //Instance variable
    int price;           //Instance variable
    static String name;  //Static variable
                                   
    public void show (){                                                //Used to print 
        System.out.println(brand + " : " + price + " : " + name );
    }

}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "SamSung";
        obj1.price = 150000;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 149999;
        Mobile.name = "Smartphone";                                    //Static variable is called with class

        obj1.show();                                                   //call here to print
        obj2.show();
    }
}
