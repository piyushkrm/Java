import java.util.*;

//List container

// Print the list element
public static void printList(List<Integer> list) {
    for (Integer i : list) { 
        System.out.print(i + " ");
    }
    System.out.println();
}



public class listContainer {
    public static void main(String[] args) {
        // Create list
        List<Integer>list = new ArrayList<>();

        // Add element
        list.add(10);
        
    }
}
