import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter a integer!");
            scanner.next();
            return;
        }
        int n = scanner.nextInt();
        List<Integer> primes = new ArrayList<>();

        for(int i = 2; i < n; i++){
            boolean isPrime = true;
            if( i == 2 || i == 3){
                primes.add(i);
                continue;
            }
            if( i % 2 == 0 || i % 3 == 0){
                isPrime = false;
            }
            for(int j = 5; j <= Math.sqrt(i); j += 6 ){
                if( i % j == 0 || i % (j + 2) == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(i);
            }
        }
        System.out.println("Prime numbers from 1 to " + n + " are: " + primes);
        scanner.close();
    }

}