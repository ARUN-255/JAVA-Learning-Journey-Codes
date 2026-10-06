package ObjectOrientedProgramming;


public class ArrayDemo {
    public static void main(String[] args) {
        //Array is used to save multible data in a single variable
        //Declaring a array
        int num[] = { 5, 6, 7, 3 };

        //Changing a value that is a specific random number from the array num 
        num[1] = 89;
        
        //Printing the statement
        System.out.println(num[1]);

        //Initializing a array without values that is getting value after initializing
        int num1[] = new int[4];

        //Declaring or assigining a number
        num1[0] = 6;
        num1[1] = 7;
        num1[2] = 8;
        num1[3] = 3;

        //Printing the statement multiple times
        /*  System.out.println(num1[0]);
            System.out.println(num1[1]);
            System.out.println(num1[2]);
            System.out.println(num1[3]);
        */

        //Using For Loop
        for( int j=0; j<=3; j++)
        {
            System.out.println(num1[j]);
        }
    }
}
