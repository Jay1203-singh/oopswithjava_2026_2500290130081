class student {
    String name;
    int age;
    student(String s, int a) {
        this.name = s;
        this.age = a;
    }
}
public class constructor {
    public static void main(String[] args) {
        student s1 = new student("Jay", 21);
        student s2 = new student("Ravi", 22);
    }
}