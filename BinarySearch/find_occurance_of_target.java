package BinarySearch;
public class find_occurance_of_target {
    public static int occurance(int[] arr, int target)
    {
        int answer=upper_bound(arr, target)-lower_bound(arr, target);
        return answer;
    }

    public static int lower_bound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid; //potential answer
                end = mid - 1; //look for earlier occurance
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int upper_bound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                ans = mid; // potential answer
                end = mid - 1; // look for earlier occurances
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 20, 20, 20, 20, 30, 40, 50 };
        System.out.println(occurance(arr, 60));
    }
}
