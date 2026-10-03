package ObjectOrientedProgramming;

class Calculator3{
     public int sub(int n1, int n2, int n3, int n4){
        int s = n1 - n2 - n3 - n4;
        return s;
     }
}

public class OopsDemo3 {
    public static void main(String[] args) {
        
        int num1 = 12;
        int num2 = 64;
        int num3 = 35;
        int num4 = 67;

        Calculator3 subtract = new Calculator3();
        int result = subtract.sub(num1, num2, num3, num4);
        System.out.println(result);

    }
}
