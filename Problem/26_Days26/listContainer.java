import java.util.*;

//List container
public class listContainer {

// Print the list element
public static void printList(List<Integer> list) {
    for (Integer i : list) { 
        System.out.print(i + " ");
    }
    System.out.println();
}



    public static void main(String[] args) {
        // Create list
        List<Integer>list = new ArrayList<>();

        // Add element
        list.add(10);
        list.add(13);
        list.add(15);
        list.add(17);
        printList(list);        // print list of elements
        
        // Get element  
        System.out.println("Element at the index 2 is : "+ list.get(2)); // get element from list at position 2

        // Add element on the at specified index
        list.add(1, 12);
        printList(list);
        

        
    }
}
