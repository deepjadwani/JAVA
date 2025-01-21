import java.util.*;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine().toLowerCase();

        int vouwelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch =input.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u'){
                vouwelCount++;
            }            
        }

        System.out.println("total count of wovel in " + input+ " is " + vouwelCount);
    }
    
}
