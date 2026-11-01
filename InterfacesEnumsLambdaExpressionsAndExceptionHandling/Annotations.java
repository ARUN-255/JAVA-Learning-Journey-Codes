package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

class VehiclDemo{
    public void Show(){
        System.out.println("Driving a car");
    }    
}

class Bike extends VehiclDemo{
    @Override 
    public void Show(){
        System.out.println("Driving a bike");
    }
}

public class Annotations {
    public static void main(String[] args) {
        VehiclDemo object = new Bike();
        object.Show();
    }
}
