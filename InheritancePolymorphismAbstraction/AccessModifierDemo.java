package InheritancePolymorphismAbstraction;

class HouseA{
    //default
    String defaultAM = "This is the living room";
    //public
    public String publicAM = "This is the park";
    //private
    private String privateAM = "This is my bedroom";
    //protected
    protected String protectedAM = "This is my backyard";
    //making private to public
    public void showPrivateValue(){
        System.out.println(privateAM);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {

        HouseA object = new HouseA();

        System.out.println(object.defaultAM);
        System.out.println(object.publicAM);
        object.showPrivateValue();
        System.out.println(object.protectedAM);        
    }
}
