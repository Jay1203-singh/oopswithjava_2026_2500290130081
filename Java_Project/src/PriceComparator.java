import java.util.*;

class Product implements Comparable<Product> {
    int product_id;
    int price;
    String P_name;

    Product(int id, int p, String name) {
        product_id = id;
        price = p;
        P_name = name;
    }

    @Override 
    public int compareTo(Product p) {
        return p.price - this.price; // Sort by price in descending order
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return P_name + " "+ price;
}

}

class customcomparator implements Comparator<Product> {
    @Override 
    public int compare(Product p1, Product p2) {
        if (p1.price != p2.price) {
            return p2.price - p1.price; // Sort by price in descending order
        }
        return p1.P_name.compareTo(p2.P_name); // If prices are equal, sort by product name in ascending order
    }
}


public class PriceComparator {
    public static void main(String[] args) {
        ArrayList<Product> pro = new ArrayList<>();

        pro.add(new Product(1, 36, "Clothes"));
        pro.add(new Product(2, 40, "Shoes"));
        pro.add(new Product(3, 30, "Bags"));
        pro.add(new Product(4, 25, "Watches"));
        pro.add(new Product(5, 10, "Jewellery"));
        
        pro.sort(null); // Sort using the natural ordering defined by compareTo

        System.out.println(pro);




    }
}
