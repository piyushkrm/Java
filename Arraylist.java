import java.util.ArrayList;
import java.util.Collections;

class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<>();

        // add element to the array list

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(15);
        list.add(20);
        System.out.println(list);

        strList.add("Piyush");
        strList.add("Aditya");
        System.out.println(strList);

        // get element
        int element = list.get(0);
        System.out.println(element);
        String strElment = strList.get(1);
        System.out.println(strElment);

        // add element in between
        strList.add(1, "mishra");
        System.out.println(strList);

        // set and replace element
        strList.set(0, "Pihu");
        System.out.println(strList);

        // delete an element
        strList.remove(1);
        System.out.println(strList);

        // count or size of an arrayList
        int size = list.size();
        System.out.println(size);

        int sizee = strList.size();
        System.out.println(sizee);

        // iterate or loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println();

        // sorting -->default is accending order
        Collections.sort(list);
        System.out.println(list);

    }
}