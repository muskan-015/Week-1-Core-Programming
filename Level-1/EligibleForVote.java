import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        // To Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
