import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("We can, we should & we will");
        System.out.println("Example 1\nLoop");
        for (int i = 1; i < 50; i++) {
            System.out.println(i);
            System.out.println("Hey piyush");
        }

        System.out.println("Example 2\nPrint number from 1 to 10");
        for (int index = 0; index <= 10; index++) {
            System.out.println(index);
            System.out.print(index + " ");
        }

        System.out.println("Example 3");
        int k = 1;
        while (k <= 12) {
            System.out.println("Piyush");
            k++;
        }

        System.out.println("Example 4");
        int j = 1;
        do {
            System.out.println("hey boos!");
            j++;
        } while (j == 10);

        System.out.println("Example 5\nPrint first n natural number sum : ");
        System.out.print("Enter number for sum :" + " ");
        Scanner sc = new Scanner(System.in);
        int naturalNum = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= naturalNum; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of entered natural number is " + sum);

        System.out.println("Example 6\nPrint the table : ");
        System.out.print("Enter number for printung table : ");
        Scanner tab = new Scanner(System.in);
        int table = tab.nextInt();
        int tabl = 0;
        for (int i = 1; i <= 10; i++) {
            tabl = table * i;
            System.out.println(table + " " + "*" + " " + i + " = " + "" + tabl);
        }
    }
}