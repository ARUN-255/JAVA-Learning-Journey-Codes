package ObjectOrientedProgramming;

class Calculator5{
    public double division(double n1, double n2){
        double d = n1 / n2;
        return d;
    }
}

public class OopsDemo5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 18;

        Calculator5 Division = new Calculator5();
        double Calculator5 = Division.division(num1, num2);

        System.out.println(Calculator5);


    }
}
