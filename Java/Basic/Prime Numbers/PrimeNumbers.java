import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number to see prime number ");
        int n = scanner.nextInt();
        if(n < 1){
            System.out.println("Enter Positive Number");
        }
        else if(n == 1){
            System.out.println("1 only has one factor, itself, so it doesn't meet the criteria to be a prime number");
        }
        else
        {

        System.out.println("Prime numbers between 1 and " + n + " are:");

        for (int number = 2; number <= n; number++){
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if(number % i == 0){
                    isPrime = false;
                    break;
                }                
            }
            if(isPrime){
                System.out.println( number + " ");
            }
        }
        }
        scanner.close();
    }    
}
