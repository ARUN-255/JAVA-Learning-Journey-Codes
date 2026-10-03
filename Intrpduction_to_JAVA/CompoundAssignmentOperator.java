package Intrpduction_to_JAVA;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        
        //COMPOUND ASSIGNMENT OPERATORS ( A MIX OF ARITHMETIC OPERATORS AND ASSIGNMENT OPERATOR )
        
        int num1 = 100;
        int num2 = 50;

        //THE OPERATIONS INVOLVED IN EACH STEPS CHANGES THE VALUE OF num1 

        num1 += num2; //100 + 50 = 150 ; NOW THE VALUE OF num1 CHANGES TO 150
        num1 -= num2; //150 - 50 = 100 ; NOW THE VALUE OF num1 CHANGES TO 100
        num1 *= num2; //100 * 50 = 5000 ; NOW THE VALUE OF num1 CHANGES TO 5000
        num1 /= num2; //5000 / 50 = 100 ; NOW THE VALUE OF num1 CHANGES TO 100
        num1 %= num2; //100 % 50 = 0 ; NOW THE VALUE OF num1 CHANGES TO 0

        System.out.println(num1); //THE OUTPUT WILL BE PRINTED 0
    }
}
