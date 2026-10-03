package ObjectOrientedProgramming;

class Calculator2{
    public int add(int n1, int n2, int n3){
        int a = n1 + n2 + n3;
        return a;
    }
}


public class OopsDemo2 {
    public static void main(String[] args) {
        
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;

        Calculator2 calc = new Calculator2();
        int result = calc.add(num1, num2, num3);
        System.out.println(result);
    }
}
