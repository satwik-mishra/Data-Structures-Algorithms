package Recursion;

public class number_example_recursion {
    public static void main(String[] args) {
        printNumbers(1);
    }
    static void printNumbers(int n)
    {
        if(n==5)
        {   
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
}
