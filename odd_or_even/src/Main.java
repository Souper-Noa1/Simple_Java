//Write a program to check if a number is an odd or an even number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if(!scanner.hasNext()){
            System.out.println("Invalid input, please try again!");
            return;
        }
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println( num + " is an even number!");
        }else{
            System.out.println(num + " is an odd number!");
        }
    }
}