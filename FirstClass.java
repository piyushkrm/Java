import java.util.Scanner;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        System.out.println("Hello Piyush!");
        int a = 10;
        int b = 25;
        System.out.println("Hello My Dear Friend");
        System.out.println(a + b);

        // Variables
        String name = "Piyush";
        int age = 20;
        int phone = 74882419;
        String email = "piyushkrm03@gmail.com";
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(email);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String nam = sc.nextLine();
        System.out.println("Your name is : ");
        System.out.println(nam);

        // ASSESMENT 1
        System.out.println("Enter 2 number and print their sum : ");
        System.out.println("Enter your first number :");
        Scanner x = new Scanner(System.in);
        int a1 = x.nextInt();
        System.out.println("Enter yur second number :");
        Scanner y = new Scanner(System.in);
        int a2 = y.nextInt();
        int sum = a1 + a2;
        System.out.println("Sum of entered number is : ");
        System.out.println(sum);
    }
}
