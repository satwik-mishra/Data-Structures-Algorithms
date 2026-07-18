package BinarySearch;

public class upper_bound {
    public static int find_upper_bound(int arr[],int target)
    {
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                ans=mid; //potential answer
                end=mid-1; //look for earlier occurances
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
