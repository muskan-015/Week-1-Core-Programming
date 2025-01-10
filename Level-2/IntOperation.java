import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // user input for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        // integer operations 
        int result1 = a + b * c;  
        int result2 = a * b + c;  
        int result3 = c + a / b;  
        int result4 = a % b + c;  

        // Display the results
        System.out.printf("The results of Int Operations are: "+ result1 +", " +result2+", " + result3+" and " + result4);

        // Close the Scanner
        input.close();
    }
}
