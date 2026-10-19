package InheritancePolymorphismAbstraction;

class BasicCalculator1{

    public int add(int num1 , int num2 ){
        return num1 + num2;
    }

    public int sub(int num1 , int num2){
        return num1 - num2;
    }
}

class AdvancedCalculator1 extends BasicCalculator1{

    public int multi(int num1 , int num2){
        return num1 * num2 ;
    }

    public int div(int num1 , int num2){
        if (num2 == 0 ){
            return 0;
        } return num1 / num2;
    }
}

class ScientificCalculator extends AdvancedCalculator1{
    
    public double power(double base , double exponent){
        return Math.pow(base , exponent);
    }
}

public class MultipleLevelInheritanceDemo {
    public static void main(String[] args) {
        
        ScientificCalculator calc = new ScientificCalculator();

        System.out.println("Addition (Grandparent) : " + calc.add(10,5));
        System.out.println("Multiplication (Parent) : " + calc.multi(10,5));
        System.out.println("Power (child) : " + calc.power(10, 5));

    }
}
