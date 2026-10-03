package ObjectOrientedProgramming;

class Calculator4{

    public int multiply(int m1, int m2, int m3){
        int m = m1 + m2 + m3 ;
        return m;
    }
}

public class OopsDemo4 {
    public static void main(String[] args) {
        
        int num1 = 12;
        int num2 = 17;
        int num3 = 18;

        Calculator4 Multiply = new Calculator4();
        int result = Multiply.multiply(num1 , num2 , num3);
        System.out.println(result);
    }
}
