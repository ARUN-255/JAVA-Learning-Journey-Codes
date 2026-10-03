package Intrpduction_to_JAVA;

public class SwitchOperators2 {
    public static void main(String[] args) {
        //ANOTHER WAY OF IMPLEMENTING SWITCH STATEMENTS
        //CLASSICAL WAY

        int menuChoice = 2;

        switch (menuChoice) {
            case 1 : 
                System.out.println("Withdraw Cash...");
                break;

            case 2 :
                System.out.println("Deposit Cash...");
                break;

            case 3 : 
                System.out.println("View Balance...");
                break;
        
            default:
                System.out.println("Enter a Valid number between 1 and 3");
                break;
        }
    }
}
