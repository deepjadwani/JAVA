import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
    
        int year = scanner.nextInt();
        
        boolean isleapYear = false;
    
        if(( year  % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            isleapYear = true;
            System.out.println(year + " is Leap Year.");
        }else{
            System.out.println(year + " year is not Leap Year.");
        }
    }
}
