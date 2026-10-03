package Intrpduction_to_JAVA;

public class TernaryOperators {
    public static void main(String[] args) {
        
        //TERANARY OPERATOR IS A ALTERNATIVE OF CONDITIONAL OPERATORS , LIKE RETURN IN A SINGLE LINE
        //CALCULATING WHETHER DELIVERY CHARGE IS APPLICABLE OR NOT

        int cartTotal = 699;

        String deliveryChargeApplicable = (cartTotal>=500) ? "Free Delivery" : "Need to pay 100 rupees as delivery charge" ;

        System.out.println(deliveryChargeApplicable);
    }
}
