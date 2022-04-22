package recursion;

public class LinearRecursion {

    public static int linearSum(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return linearSum(data, n - 1) + data[n - 1];
        }
    }

    public static void main(String[] args) {
        //int[] data = {4, 3, 6, 2, 8, 9, 3, 2, 8, 5, 1, 7, 2, 8, 3, 7};
        int[] data = {4, 3, 6, 2, 8};
        System.out.println(linearSum(data, 5));
    }
}
