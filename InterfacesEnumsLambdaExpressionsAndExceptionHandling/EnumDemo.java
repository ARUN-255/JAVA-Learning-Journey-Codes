package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

import java.util.Scanner;

//defining a Enum
//Usually enum are defined in caps letter because they are constant
enum DeliveryStatus{
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

public class EnumDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Status (PENDING, SHIPPED, DELIVERED, CANCELLED) : ");
        String userInput = scanner.nextLine();

        DeliveryStatus currenStatus = DeliveryStatus.valueOf(userInput);
        System.out.println("Processing : " + currenStatus);

        switch (currenStatus) {
            case PENDING:
                System.out.println("Your order is getting prepared");
                break;

            case SHIPPED:
                System.out.println("Your order is shipped");
                break;

            case DELIVERED:
                System.out.println("Your  order is delivered to you");
                break;

            case CANCELLED:
                System.out.println("You cancelled the order");
                break;
        }
        scanner.close();
    }
}
