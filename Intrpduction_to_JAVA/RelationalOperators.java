package Intrpduction_to_JAVA;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 23;

        if(num1==num2){
            System.out.println("The given number is equal to each other");
        }else{
            System.out.println("The given number is not equal to each other");
        }

        if(num1!=num2){
            System.out.println("The given is not equal to each other");
        }else{
            System.out.println("The given number is equal to each other");
        }

        if(num1>num2){
            System.out.println("The num1 is greater then num2");
        }else{
            System.out.println("The num1 is not greater than num2");
        }

        if(num1<num2){
            System.out.println("The num1 is lesser than num2");
        }else{
            System.out.println("The num1 is not smaller than num2");
        }

        if(num1>=num2){
            System.out.println("The num1 is greater than or equal to num2");
        }else{
            System.out.println("The num1 is not greater than or equal to num2");
        }

        if(num1<=num2){
            System.out.println("The num1 is lesser than or equal to num2");
        }else{
            System.out.println("The num1 is not lesser than or equal to num2");
        }
    }
}
