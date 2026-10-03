package Intrpduction_to_JAVA;

public class ConditionalStatement {
    public static void main(String[] args) {
        
        //RUNS BASED ON A CONDITIONS
        //GRADE SYSTEM

        int score = 94;

        if(score >= 95){
            System.out.println("Your Grade is O+");
        }
        else if(score >= 90){
            System.out.println("Your Grade is O");
        }
        else if(score >= 80){
            System.out.println("Your Grade is A");
        }
        else if(score >= 70){
            System.out.println("Your Grade is B");
        }
        else if(score >= 60){
            System.out.println("Your Grade is C");
        }
        else if(score >= 50){
            System.out.println("Your Grade is D");
        }
        else{
            System.out.println("Your Grade is F ( Fail )");
        }
    }
}
