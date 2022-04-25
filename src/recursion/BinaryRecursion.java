package recursion;

public class BinaryRecursion {

    //summing the n integers of an array
    public static int binarySum(int[] data, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return 0;
        } else if (lowIndex == highIndex) {
            return data[lowIndex];
        } else {
            int mid = (lowIndex + highIndex) / 2;
            return binarySum(data, lowIndex, mid) + binarySum(data, mid + 1, highIndex);
        }
    }

    /**
     * binarySum(data, 0, 7)
     * binarySum(data, 0, 3) + binarySum(data, 4, 7)
     * binarySum(data, 0, 1) + binarySum(data, 2, 3) + binarySum(data, 4, 5) + binarySum(data, 6, 7)
     * binarySum(data, 0, 0) + binarySum(data, 1, 1) + binarySum(data, 2, 2) + binarySum(data, 3, 3) + binarySum(data, 4, 4) + binarySum(data, 5, 5) + binarySum(data, 6, 6) + binarySum(data, 7, 7)
     * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySum(arr, 0, 7));
    }
}
