package InterfacesEnumsLambdaExpressionsAndExceptionHandling;
//@FunctionalInterface 
interface A{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("Show A");
            }
        };
        obj.show();
    }
}
