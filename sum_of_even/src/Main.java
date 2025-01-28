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
                if(i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("The sum of even numbers from 1 to " +num + " is " +sum);
            break;
        }
        scanner.close();
    }
}
