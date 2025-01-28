//Input a positive integer and calculate the sum from 1 to that number.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.print("Enter a number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input, please try again!");
                scanner.next();
            }
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.print("Invalid input, please enter a positive integer");
                continue;
            }
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum of " +num + " is " +sum);
            break;
        }
        scanner.close();
    }
}
