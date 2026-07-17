package Recursion;

public class ques07_product_of_digits {
    public static int product_of_digits(int n)
    {
        if(n<10)
        {
            return n;
        }
        return n%10*product_of_digits(n/10);
    }
    public static void main(String[] args) {
        System.out.println("product of digits : "+product_of_digits(123));
    }
}