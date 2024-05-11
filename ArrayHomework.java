import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        System.out.println("HOMEWORK");
        System.out.println("Question 1");
        System.out.println("Take an array of names as input from the user and print them on the screen : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        String names[] = new String[size];
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " name : ");
            names[i] = sc.next();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + " is : " + names[i]);
        }

        System.out.println("Question 2");
        System.out.println("Find the maximum & minimum number in an array of integers.");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }

            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

        System.out.println("Question 3");
        System.out.println("Take an array of numbers as input and check if it is an array sorted in ascending order.\nEg:{1,2,4,7} is sorted in ascending order. \n{3,4,6,2}is not sorted in ascending order");
        System.out.print("Enter size of an array : ");
        int sizee = sc.nextInt();
        int numberr[] = new int[sizee];
        for (int i = 0; i < numberr.length; i++) {
            System.out.print("Enter " + i + " element of array : ");
            numberr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < numberr.length - 1; i++) {
            if (numberr[i] > numberr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
