package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

//creating a interface
interface Divider{
    int Divide(int num1 , int num2 );
}

public class ExceptionHandling {
    public static void main(String[] args) {
        
        //Creating the division logic with lambda expression
        Divider mathAction = (int num1, int num2 ) -> num1 / num2;
        System.out.println("-----START OF CALCULATOR-----");

        //Using exception handling to run our lambda safely
        try{
            System.out.println("Sending numbers to labda : 10 divided by 0....");

            //This line triggers the lambda with invalid data
            int result = mathAction.Divide(10, 0);
            System.out.println("Result "+result);
        }
        catch(ArithmeticException e){
            //Our safety net catches the error generated inside the lambda 
            System.out.println("Safety net triggered cannot divide by Zero");
            System.out.println("Error message from Java : "+e.getMessage());

            System.out.println("----End of Calculator---(App closed safely)----");
        }


    }
}
