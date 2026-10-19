package InheritancePolymorphismAbstraction;

class MaruthiSuzuki{
    String brand ;
    int price ;

    public MaruthiSuzuki(){
        System.out.println("Car details");
    }

    public void show() {
        System.out.println("Showing car details -->  " + "Brand" + brand + ", Price" + price );
    }
}

public class AnonymousObjectDemo {
    public static void main(String[] args) {
        
        //regurlar named object 
        MaruthiSuzuki regularObject = new MaruthiSuzuki();
        regularObject.brand = "baleno";
        regularObject.price = 500000 ;
        regularObject.show();
        //anonymous named object 
        new MaruthiSuzuki().show();
    }
}
