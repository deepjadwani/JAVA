import  java.util.*;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2;

        System.out.println("The maximum of " + number1 + " and " + number2 + " is: " + max);

        scanner.close();

    }
}
