package InheritancePolymorphismAbstraction;

class BasicCalculator{

    public int add(int num1 , int num2 ){
        return num1 + num2 ;
    }

    public int sub( int num1 , int num2 ){
        return num1 - num2;
    }

}  
class AdvancedCalculator extends BasicCalculator{

    public int multi( int num1 , int num2){
        return num1 * num2 ;
    }

    public int div(int num1 , int num2){
        if(num2 == 0){
            System.out.println("Error : Division by zero");
            return 0;
        }
        return num1 / num2 ;
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        
        AdvancedCalculator calc = new AdvancedCalculator();
        int sum = calc.add(4,10);
        int diff = calc.sub(4,10);
        int prod = calc.multi(4,10);
        int qout = calc.div(4,10);

        System.out.println("Addtion (Inherited) : " + sum);
        System.out.println("Subtraction (Inherted) : " + diff);
        System.out.println("Multiplication (new) : " + prod);
        System.out.println("Division (new) : " + qout);


    }
}
