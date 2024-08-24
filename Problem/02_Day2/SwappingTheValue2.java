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

        

        // Approach 2 Without using temp variable
        int c = 45;
        int d = 55;
        System.out.println("Befone swapping the values of c is : " + c + " and d is : " + d);
        
        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("After swapping the values of c is : " + c + " and d is : " + d);




        // Approach 3 Swapping value using operator
        int e = 22;
        int f = 55;
        System.out.println("Befone swapping the values of e is : " + e + " and f is : " + f);

        e = e ^ f;
        f = e ^ f;
        e = e ^ f;
        System.out.println("Befone swapping the values of e is : " + e + " and f is : " + f);



    }
}
