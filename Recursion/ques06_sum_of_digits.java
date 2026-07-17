package Recursion;

public class ques06_sum_of_digits {
    public static int sum_of_digits(int n)
    {
        if(n<10)
        {
            return n;
        }
        return n%10+sum_of_digits(n/10);
    }
    public static void main(String[] args) {
        System.out.println("sum of digits : "+sum_of_digits(9));
    }
}
