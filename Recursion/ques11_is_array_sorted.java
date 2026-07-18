package Recursion;
public class ques11_is_array_sorted {
    public static boolean is_sorted(int[]arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && is_sorted(arr, index+1);
    }
 public static void main(String[] args) {
    int arr[]={1,2,3,8,5};
    System.out.println(is_sorted(arr, 0));
 }   
}
