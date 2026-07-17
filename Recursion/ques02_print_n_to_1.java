package Recursion;
public class ques02_print_n_to_1 {
    public static void printing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printing(n-1);
    }
    public static void main(String[] args) {
        printing(5);
    }
}
