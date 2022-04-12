package recursion;

import java.util.Arrays;

public class ReverseString {
/*---------- Reverse array in place, Time Complexity O(n), Space Complexity O(n)-----------*/
    private static void reverseString(char[] strArr) {
        helper(strArr, 0, strArr.length - 1);
    }

    private static void helper(char[] strArr, int left, int right) {
        if (left >= right) return;
        char tmp = strArr[left];
        strArr[left++] = strArr[right];
        strArr[right--] = tmp;
        helper(strArr, left, right);
    }
/*-------------Same thing with a while loop instead of recursion-------------*/
    private static void reverseStringWhileLoop(char[] strArr) {
        int left = 0;
        int right = strArr.length - 1;
        while (left < right) {
            char tmp = strArr[left];
            strArr[left++] = strArr[right];
            strArr[right--] = tmp;
        }
    }

    public static void main(String[] args) {
        String str = "Reverse string";
        char[] strArr = str.toCharArray();
        reverseString(strArr);
        System.out.println(Arrays.toString(strArr));
        reverseStringWhileLoop(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
