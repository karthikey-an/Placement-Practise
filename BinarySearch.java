import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;     
            else if (arr[mid] < key) left = mid + 1; 
            else right = mid - 1;
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); 
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if (result == -1) System.out.println("Not Found");
        else System.out.println("Found at index " + result);
    }
}
