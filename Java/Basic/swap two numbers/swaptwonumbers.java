import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First Number a = ");
        int a = scanner.nextInt();
        
        System.out.print("Enter Second Number b = ");
        int b = scanner.nextInt();


       a = a + b;
       b = a - b;
       a = a - b;

        System.out.println("reverse String is a = " + a + "and b = " + b);

    }
    
}
