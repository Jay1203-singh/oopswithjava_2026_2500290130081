import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            checkage(age);
        } catch (AgeInvalidException e) {
            System.out.println(e);   
        } finally {
            sc.close();
        }
    }
    static void checkage(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age is not valid to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
class AgeInvalidException extends Exception {//creates a checked exception
    AgeInvalidException(String str) {
        super(str);
    }
}
//runtime exception is unchecked exception and checked exception is compile time exception
