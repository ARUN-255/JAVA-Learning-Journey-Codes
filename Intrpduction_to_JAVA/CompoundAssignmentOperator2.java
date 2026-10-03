package Intrpduction_to_JAVA;

public class CompoundAssignmentOperator2 {
    public static void main(String[] args) {
        
        //TO OVERCOME 0 AS OUTPUT WE NEED TO RESET THE num1 VALUE TO DEFAULT VARIABLE 

        int num1 = 100;
        int num2 = 50;

        num1 += num2;
        System.out.println(num1);
        num1 = 100;

        num1 -= num2;
        System.out.println(num1);
        num1 = 100;

        num1 *= num2;
        System.out.println(num1);
        num1 = 100;

        num1 /= num2;
        System.out.println(num1);
        num1 = 100;

        num1 %= num2;
        System.out.println(num1);
        num1 = 100;
    }
}
