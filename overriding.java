public class overriding {
    public static void main(String[] args) {
        shape obj = new circle();
        obj.area();
        shape obj1 = new rectangle(5, 10);
        obj1.area();
        shape[] obj2 = {new circle(), new rectangle(5, 10)};
        for (shape s : obj2) {
            s.area();
        }
    }
}

class shape {
    void area() {
        System.out.println("Area of shape");
    }
}
class circle extends shape {
    void area() {
        System.out.println("Area of circle" + 3.14 * 5 * 5);
    }
}
class rectangle extends shape {
    private int l, b;
    rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    void area() {
        System.out.println("Area of rectangle" + l * b);
    }
}
