import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollNo;
    int marks;

    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks;
    }
}

class customComparator implements Comparator<Student> {
    @Override 
    public int compare(Student s1, Student s2) {
        if (s1.marks != s2.marks) {
            return s2.marks - s1.marks; // Sort by marks in descending order
        }
        return s1.rollNo - s2.rollNo; // If marks are equal, sort by roll number in ascending order
    }
}

class NameComparator implements Comparator<Student> {
    @Override 
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Sort by name in ascending order
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Integer> i = new ArrayList<>();

        i.add(10);
        i.add(2);
        i.add(30);
        i.add(40);
        i.add(24);

        System.out.println("Before Sorting: " + i);

        i.sort(Collections.reverseOrder());

        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("John", 1, 85));
        s.add(new Student("Alice", 2, 90));
        s.add(new Student("Bob", 3, 75));
        s.add(new Student("Eve", 4, 95));
        s.add(new Student("Charlie", 5, 80));

        s.sort(null); //Comparable

        System.out.println("After Sorting: " + s);

        s.sort(new customComparator()); //Comparator

        System.out.println("After Sorting: " + s);
    }
}