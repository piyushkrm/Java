import java.util.LinkedList;

class LinkedlistColl {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("a");
        list.addLast("Coder");
        list.add("!"); // default add in the last of an list

        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
