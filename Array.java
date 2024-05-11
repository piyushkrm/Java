import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] subject = new int[5]; // declaration of array
        // int subject[] = new int[5]; //2nd method of declaration of array
        subject[0] = 95;
        subject[1] = 92;
        subject[2] = 85;
        subject[3] = 29;
        subject[4] = 89;
        // int subject[] = {95, 92, 85, 29, 89}; //another method
        // System.out.println(subject[1]);
        for (int i = 0; i < subject.length; i++) {
            System.out.print(subject[i] + ", ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int userArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " element : ");
            userArray[i] = sc.nextInt();
        }
        System.out.print("Array is like : ");
        for (int i = 0; i < size; i++) {
            System.out.print(userArray[i] + ", ");
            ;
        }

        System.out.println("Question : Take an array from the user. search for a given number x and print the index at which is occurs.");
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int sizeofarray = scc.nextInt();
        int arrarElement[] = new int[sizeofarray];

        for (int i = 0; i < sizeofarray; i++) {
            System.out.print("Enter " + i + " element : ");
            arrarElement[i] = sc.nextInt();
        }

        System.out.print("Array is : ");
        for (int i = 0; i < sizeofarray; i++) {
            System.out.print(arrarElement[i] + " ");
        }
        System.out.print("\nWhich element you need to search : ");
        int search = sc.nextInt();
        for (int i = 0; i < arrarElement.length; i++) {
            if (arrarElement[i] == search) {
                System.out.println("Found it at index : [" + i + "]");
            }
        }
    }
}
