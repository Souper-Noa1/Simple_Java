import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input, please try again!");
                scanner.next();
                continue;
            }

            int day = scanner.nextInt();

            if (day >= 2 && day <= 8) {
                switch (day) {
                    case 2:
                        System.out.println("It's Monday");
                        break;
                    case 3:
                        System.out.println("It's Tuesday");
                        break;
                    case 4:
                        System.out.println("It's Wednesday");
                        break;
                    case 5:
                        System.out.println("It's Thursday");
                        break;
                    case 6:
                        System.out.println("It's Friday");
                        break;
                    case 7:
                        System.out.println("It's Saturday");
                        break;
                    case 8:
                        System.out.println("It's Sunday");
                        break;
                }
                break;
            } else {
                System.out.println("Invalid day, please try again!");
            }
        }
    }
}
