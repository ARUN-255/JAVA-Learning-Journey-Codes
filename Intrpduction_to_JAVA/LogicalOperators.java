package Intrpduction_to_JAVA;

public class LogicalOperators {
    public static void main(String[] args) {
        
        //MOVIE TICKET BOOKING PROCESS

        int cash = 20;
        int age = 18;

        boolean ticketAvialable = true;
        boolean studentId = true;
        boolean isSoldOut = false;

        if(cash>15 && ticketAvialable){
            System.out.println("Ticket Avialable");
        }else{
            System.out.println("Ticket Unavialable");
        }

        if(age<=18 || studentId){
            System.out.println("Discount avialable");
        }else{
            System.out.println("Discount not eligible");
        }

        if(!isSoldOut){
            System.out.println("The ticket is not SOld Out");
        }else{
            System.out.println("The ticket is Sold Out");
        }
    }
}
