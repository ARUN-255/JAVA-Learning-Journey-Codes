package Intrpduction_to_JAVA;

public class SwitchStatements {
    public static void main(String[] args) {
        //SWITCH STATEMENT IS A MULTI WAY OF BRANCH THAT DIRECTS THE EXECUTION CODE TO DIFFERENT PARTS OF THE CODE BASED ON THE VALUE OF THE EXPRESSION
        //PRINTING DAY OF THE WEEK BY VALUE
        //MODERN METHOD
        
        int day = 5;

        switch(day){
            case 1 -> System.out.println("This is Monday");
            case 2 -> System.out.println("This is Tuesday");
            case 3 -> System.out.println("This is Wednessday");
            case 4 -> System.out.println("This is Thursday");
            case 5 -> System.out.println("This is FRiday");
            case 6 -> System.out.println("This is Saturday");
            case 7 -> System.out.println("This is Sunday");
            default -> System.out.println("Enter a Valid number between 1 and 7");
        }
    }
}
