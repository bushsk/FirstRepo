import java.util.Scanner;

public class AddTwoNumbers {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
