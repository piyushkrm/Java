import java.util.*;

public class setContainer {

    // print set element
    public static void printSet(Set<Integer> set) {
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a new container ie set
        Set<Integer> mySet = new HashSet<>();
        // Add elements to the set
        mySet.add(15);
        mySet.add(25);
        mySet.add(35);
        mySet.add(45);
        mySet.add(55);
        mySet.add(55);
        // Print the set
        printSet(mySet);

        // remove element
        mySet.remove(25);
        // Print the set after removing element
        printSet(mySet);

        // size of the set
        System.out.println("Size of the set is: " + mySet.size());

        // Contain the set element
        System.out.println(mySet.contains(505));
    }
}
