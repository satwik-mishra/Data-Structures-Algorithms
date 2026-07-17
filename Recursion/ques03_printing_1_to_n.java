package Recursion;

public class ques03_printing_1_to_n {
    public static void printing(int n)
    {
        if(n==0)
        {
            return;
        }
        printing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printing(5);
    }
}
