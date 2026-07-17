package Recursion;

public class ques08_reverse_a_number {
    static int rev=0;
    public static int reverse(int n)
    {
        if(n==0)
        {
            return n;
        }
        int d=n%10;
        rev=rev*10+d;
        reverse(n/10);
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Reverse of the number is : "+reverse(1234));
    }
}
