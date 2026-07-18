package Recursion;

public class ques12_linear_search {
    public static int linear_search(int arr[],int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else
        {
            return linear_search(arr, target, index+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
        System.out.println(linear_search(arr, 1, 0));
    }
}
