import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + sub);
        System.out.println("The product is: " + mul);
        if (num2 != 0) {
            System.out.println("The quotient is: " + div);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    
}
