public class overloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum();
        Addition.sum(5, 10);
        obj.sum(5.5, 10.5);
    }

}
class Addition {
    void sum() {
        System.out.println("No parameters");
    }
    static void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

}
