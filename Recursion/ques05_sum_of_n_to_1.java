package Recursion;

public class ques05_sum_of_n_to_1 {
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
