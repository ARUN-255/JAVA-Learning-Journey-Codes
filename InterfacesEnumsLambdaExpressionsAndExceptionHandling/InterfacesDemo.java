package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

//creating an interface
interface WifiEnabled{
    void connectToInternet();
}

//class inmplementing the interface
class Bulb implements WifiEnabled{
    
    //calling the method inside the interface
    @Override 
    public void connectToInternet(){
        System.out.println("The fan have been connected to the internet via router , Status : Connected");
    }
    public void turnOn(){
        System.out.println("The bulb is turned on glowing brightly!");
    }
}

public class InterfacesDemo {
    public static void main(String[] args) {
        
        //calling the interfaces with upcasting
        WifiEnabled object = new Bulb();
        object.connectToInternet();
        
        Bulb object2 = new Bulb();
        object2.turnOn();
    }
}
