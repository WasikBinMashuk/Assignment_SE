import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int number1, number2, summary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        number1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        number2 = sc.nextInt();

        sc.close();
        summary = number1 + number2;
        System.out.println("Sum of these numbers: "+summary);
    }
}
