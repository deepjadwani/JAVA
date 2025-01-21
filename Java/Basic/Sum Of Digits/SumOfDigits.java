import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;            
        }

        System.out.println("sum of digits is " + sum);
    }    
}
