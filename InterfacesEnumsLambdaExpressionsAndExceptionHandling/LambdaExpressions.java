package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

//Creating a interface
interface Greeting{
    void sayHello();
}

public class LambdaExpressions {
    public static void main(String[] args) {
        
        //Normal way line overriding
        Greeting Normalway = new Greeting() {
            @Override 
            public void sayHello(){
                System.out.println("Hello!, Every one (Normal way of implementation)");
            }
        };
        Normalway.sayHello();

        //Lamda Expression
        Greeting Lambdaway = () -> System.out.println("Hello!, Every one (Lambda expression was of printing)");
        Lambdaway.sayHello();
        
    }
}
