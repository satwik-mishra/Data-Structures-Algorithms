package Recursion;

public class ques10_count_zeros {
    public static void count_zeros_iterative(int n)
    { int count=0;
        while(n!=0)
        {
            int d=n%10;
            if(d==0)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("number of zeros : "+count);
    }
    static int count(int n)
    {
        return count_zeros_recursive(n,0);
    }
    public static int count_zeros_recursive(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        int d=n%10;
        if(d==0)
        {
            return count_zeros_recursive(n/10, c+1);
        }
        return count_zeros_recursive(n/10,c);
    }
    public static void main(String[] args) {
        // count_zeros_iterative(120000);
        System.out.println(count(12345000));
    }
}
