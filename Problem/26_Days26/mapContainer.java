import java.util.*;

public class mapContainer {
    // print element
    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Map container
        Map<String, Integer> map = new HashMap<>();

        // Put element
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        // print
        printMap(map);

        // get element
        System.out.println("Value of Apple: " + map.get("Apple"));

        // Remove element
        map.remove("Banana");

        // contain key values
        System.out.println("Contains 'Cherry': " + map.containsKey("Cherry"));

        // Size of map
        System.out.println("Size of map: " + map.size());

    }
}
