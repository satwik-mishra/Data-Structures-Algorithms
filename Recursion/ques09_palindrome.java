package Recursion;

public class ques09_palindrome {
    static int rev = 0;

    public static boolean check_palindrome(int n) {
        if (n<10) {
            return true;
        }
        int temp = n;
        int d = temp % 10;
        rev = rev * 10 + d;
        check_palindrome(temp / 10);
        if (temp == rev)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("is the number palindrome? " + check_palindrome(9));
    }
}
