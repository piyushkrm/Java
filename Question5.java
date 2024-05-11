import java.util.Scanner;

public class Question5 {
    public static int ageEligible(int age) {
        if (age > 18) {
            System.out.println("Eligible for vote !");
            return 0;
        } else {
            System.out.println("Not eligible for vote !");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                "Write a function that takes in age as input and returns if the person is eligible to vote or not. a person of age > 18 is eligible to vote.");
        System.out.println("Ouestio 5");
        System.out.print("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageEligible(age);
        System.out.println("Run successfully!");
    }
}
