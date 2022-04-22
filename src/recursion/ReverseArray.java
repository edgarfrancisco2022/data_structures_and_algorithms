package recursion;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int tmp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = tmp;
            reverseArray(arr, leftIndex + 1, rightIndex - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseArray(arr, 0, 7);
        System.out.println(Arrays.toString(arr));
    }
}
