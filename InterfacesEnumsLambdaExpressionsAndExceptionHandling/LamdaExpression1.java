package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

//creating an Interface
interface MathsOperation{
    int compute(int num1 , int num2 );
}

public class LamdaExpression1 {
    public static void main(String[] args) {
        
        //Normal way of printing
        MathsOperation normalWay = new MathsOperation() {
            @Override 
            public int compute(int num1 , int num2 ){
                return num1 + num2 ;
            }
        };
        int result1 = normalWay.compute(102, 2839);
        System.out.println("The compute of normal way addition implementation is " + result1);

        //Lambda  implementation
        MathsOperation lamdaWay = (int num1 , int num2 ) -> num1 + num2 ;
        int result2 = lamdaWay.compute(17283, 278487);
        System.out.println("The compute of lambda way addtion implementation is " + result2);

    }
}
