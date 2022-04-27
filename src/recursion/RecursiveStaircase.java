package recursion;

public class RecursiveStaircase {

    public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        //Checks climbing by 1 and by 2 steps for each step, everytime it reaches n it returns 1
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

    public static void main(String[] args) {
        int result = climb_Stairs(0, 3);
        System.out.println(result);
    }
}
