public class SwappingTheValue2 {
    public static void main(String[] args) {
        // Swapping the values
        // There are many way to swapping the two different values
        // 1. Using third variable
        int a = 10;
        int b = 20;

        System.out.println("Befone swapping the values of a is : " + a + " and b is : " + b);
        // Lets swap this values
        // We use temp variable to swaping these values
        int temp = b;
        b = a;
        a = temp;

        System.out.println("After swapping the values of a is : " + a + " and b is : "+ b);

    }
}
