import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 36);
        hm.put(2,40);
        hm.put(3, 30);
        hm.put(4,25);
        hm.put(5, 10);

        //Traversing in Map using loop;

        for(Map.Entry<Integer, Integer> i : hm.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        //Searching for a key in the map
        if(hm.containsKey(3)) {
            System.out.println("Key 3 is present in the map");
        }
        else {
            System.out.println("Key 3 is not present in the map");
        }

        //Updating a existing key-value pair in the map

        hm.put(4, 33);

        //Removing a key-value pair from the map

        hm.remove(2);

        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
