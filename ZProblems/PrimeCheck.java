package ZProblems;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        //Getting input from a user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name here : ");
        String name = scanner.nextLine();

        System.out.println("Hello !" + name + ", Please enter a number that you need to find prime number or not : ");
        int num = scanner.nextInt();

        if(isPrime(num)){
            System.out.println(name + ", the number " + num + "is a prime number ");
        }else{
            System.out.println(name + ", the number " + "is not a prime number");
        }

        scanner.close();
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }else{
            for(int i = 2 ; i * i <= n ; i++){
                if(n % i == 0){
                    return false;
                }
            }
        }return true;
    }
}




