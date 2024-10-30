public class AddTwoBinary3 {


    public static void main(String[] args) {
        // Add two binary string and also return binary string

        String p = "011011";
        String q = "1010111";

        int n1 = Integer.parseInt(p, 2);
        int n2 = Integer.parseInt(q, 2);
        int sum = n1 + n2;
        String result = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary string are : "+result);

    }
}
