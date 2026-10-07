import java.util.*;
public class Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000.0;

        try {

            System.out.print("Enter withdrawal amount: ");

            double amount = sc.nextDouble();

            // Invalid withdrawal amount

            if (amount <= 0) {

                throw new IllegalArgumentException(

                    "Invalid withdrawal amount"

                );

            }

            // Insufficient balance

            if (amount > balance) {

                throw new IllegalArgumentException(

                    "Insufficient balance"

                );

            }

            balance = balance - amount;

            System.out.println("Withdrawal successful!");

            System.out.println("Withdrawn amount: " + amount);

            System.out.println("Remaining balance: " + balance);

        } catch (InputMismatchException e) {

            System.out.println("Invalid input! Please enter a number." );

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();

        }

    }

}
