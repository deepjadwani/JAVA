import java.util.Scanner;


public class TwoNumberSum{
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter First Number");
        int n1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;
        System.out.println("sum of two number is " + sum );

        scanner.close();
    }
}